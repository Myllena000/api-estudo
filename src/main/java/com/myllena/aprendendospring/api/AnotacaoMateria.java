package com.myllena.aprendendospring.api;

import org.springframework.web.bind.annotation.*;

/**
 * TODO:
 *  - implementar lista de notas
 *  - implementar os metodos PATCH, PUT e DELETE
 *  - utilizar o response entity
 *  - criar um objeto que represente as anotações
 *  - gerar id automaticamente para cada anotação salva
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
