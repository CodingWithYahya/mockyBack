package com.mockyBack.demo.controllers;


import com.mockyBack.demo.services.DefaultPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/default-plans")
public class DefaultPlansController {

    @Autowired
    private DefaultPlansService defaultPlansService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile() {
       defaultPlansService.importFromCSV();
        return ResponseEntity.ok("File uploaded and data saved successfully");
    }
}
