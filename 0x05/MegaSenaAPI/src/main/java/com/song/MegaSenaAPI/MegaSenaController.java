package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        int low = 0;
        int high = 100;
        int limit = 6;

        return new Random().ints(low,high)
                .limit(limit)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}