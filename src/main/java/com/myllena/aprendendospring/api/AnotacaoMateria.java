package com.Myllena.aprendendospring.api;

import org.springframework.web.bind.annotation.*;

/**
 * TODO = http://localhost:8080/
 */

@RestController
public class AnotacaoMateria {

    private String notepad;

    @PostMapping("/nomes")
    public String anotion(@RequestBody String anotion) {
        this.notepad = anotion;
        return "Faça sua anotação sobre a matéria, basta escrever aqui: " + anotion;
    }

    @GetMapping("/nomes")
    public String getAnotion() {
        return "Sua anotação foi: " + notepad + "Deseja atualizar?";
    }
    
}
