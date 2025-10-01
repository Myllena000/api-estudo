package com.myllena.aprendendospring.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *  - Usar uma lista para armazenar as materias do POST
 *  - Criar classe para salvar as anotações por matéria
 */
@RestController
public class MateriaApi {

    private String materia = null;

    @PostMapping("/materias")
    public String materia(@RequestBody String materia) {
        this.materia = materia;
        return "A materia " + materia + " foi cadastrada.";
    }

    @GetMapping("/materias")
    public String materia(){
        return "Materia:" + materia;
    }

}

