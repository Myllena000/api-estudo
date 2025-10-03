package com.myllena.aprendendospring.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MateriaApi {

    private List<Materia> materias = new ArrayList<>();

    @PostMapping("/materias")
    public ResponseEntity<Void> materia(@RequestBody Materia materia) {

        if (materia.getDataFim() == null && materia.getDataInicio() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        materias.add(materia);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/materias")
    public List<Materia> materia() {
        return materias;
    }
}


