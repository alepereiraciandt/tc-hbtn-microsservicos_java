package com.example.user.controller;

import com.example.user.exception.CPFException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        String msg = "You have entered valid ID";
        if (!(id > 0 && id < 100))
            throw new IllegalArgumentException("You have entered invalid ID");
        return msg;
    }

    @GetMapping("/megaSena-api")
    public void findUserById() {

    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        String msg = "You have entered valid USERNAME";
        int length = userName.length();
        if (!(length > 3 && length < 15))
            throw new IllegalArgumentException("You have entered invalid USERNAME");
        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        boolean isCPFValid = isCPF(cpf);

        String msg = "You have entered valid CPF";
        if (!isCPFValid)
            throw new CPFException("You have entered invalid CPF");
        return msg;

    }

    public boolean isCPF(String CPF) {
        int length = CPF.length();
        if (!(length > 3 && length < 15))
            return false;
        return true;
    }

}
