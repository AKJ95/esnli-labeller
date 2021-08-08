package com.durham.cs.esnlilabeller.controller;

import com.durham.cs.esnlilabeller.model.EsnliTrainEntity;
import com.durham.cs.esnlilabeller.service.EsnliTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/esnli-train")
public class EsnliTrainController {

    private EsnliTrainService esnliTrainService;

    @Autowired
    public void setEsnliTrainService(EsnliTrainService esnliTrainService) {
        this.esnliTrainService = esnliTrainService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EsnliTrainEntity> getById(@PathVariable Long id) {
        Optional<EsnliTrainEntity> result = Optional.ofNullable(esnliTrainService.getById(id));
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
