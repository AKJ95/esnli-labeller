package com.durham.cs.esnlilabeller.controller;

import com.durham.cs.esnlilabeller.model.EsnliTrainEntity;
import com.durham.cs.esnlilabeller.service.EsnliTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/esnli-train")
public class EsnliTrainController {

    private EsnliTrainService esnliTrainService;

    @Autowired
    public void setEsnliTrainService(EsnliTrainService esnliTrainService) {
        this.esnliTrainService = esnliTrainService;
    }

    @GetMapping("/{id}")
    public EsnliTrainEntity getById(@PathVariable Long id) {
        return esnliTrainService.getById(id);
    }
}
