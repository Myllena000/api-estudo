package com.Myllena.aprendendospring.api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MateriaApi {

    private String materia = null;
    private List<String> nomeMateria = new ArrayList<>();

    @PostMapping("/materias")
    public String materia(@RequestBody String materia) {
        nomeMateria.add(materia);
        return "A materia " + materia + " foi cadastrada.";
    }

    @GetMapping("/materias")
    public String materia() {
        return "A materia " + nomeMateria;
    }


}


