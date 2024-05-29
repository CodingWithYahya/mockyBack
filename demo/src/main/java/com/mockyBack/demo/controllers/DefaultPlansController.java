package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.DefaultPlans;
import com.mockyBack.demo.entities.StoreDataFromChapeau;
import com.mockyBack.demo.services.DefaultPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/default-plans")
public class DefaultPlansController {

    @Autowired
    private DefaultPlansService defaultPlansService;

    @GetMapping
    public List<DefaultPlans> findAll() {
        return defaultPlansService.findAll();
    }
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile() {
       defaultPlansService.importFromCSV();
        return ResponseEntity.ok("File uploaded and data saved successfully");
    }
}
