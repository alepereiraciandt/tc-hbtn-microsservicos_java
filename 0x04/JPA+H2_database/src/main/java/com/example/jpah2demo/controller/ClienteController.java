package com.example.jpah2demo.controller;

import com.example.jpah2demo.entity.Cliente;
import com.example.jpah2demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api-jpa-h2")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente addClient(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    @GetMapping("/findAllClients")
    public List<Cliente> findAllClients() {
        return clienteRepository.findAll();
    }

    @GetMapping("/findClientById/{id}")
    public Optional<Cliente> findClientById(@PathVariable("id") Long idClient) {
        return clienteRepository.findById(idClient);
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        clienteRepository.delete(clienteRepository.getReferenceById(idClient));
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        clienteRepository.findById(id)
    }
}