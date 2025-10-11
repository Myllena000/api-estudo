package com.myllena.aprendendospring.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MateriaApi {

    private List<Materia> materias = new ArrayList<>();

    @PostMapping("/materias")
    public ResponseEntity<Void> materia(@RequestBody Materia materia) {

        if (materia.getDataFim() == null && materia.getDataInicio() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        materias.add(materia);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("/materias")
    public List<Materia> materia(@RequestParam(required = false) String nome, @RequestParam(required = false) LocalDate dataInicio) {

        return materias.stream()
                .filter(materia -> (nome == null || materia.getNome().equalsIgnoreCase(nome))
                        && (dataInicio == null || materia.getDataInicio().compareTo(dataInicio) == 0))
                .toList();
    }

    @GetMapping("/materias/{id}")
    public Materia materia(@PathVariable UUID id) {
        return materias.stream().filter(materia -> materia.getId().compareTo(id) == 0)
                .toList()
                .getFirst();
    }

}


