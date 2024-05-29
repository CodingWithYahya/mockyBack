package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.TarifsRC;
import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.services.TarifsRCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disasterRecovery/tarification")
public class TarifsRCController {

    @Autowired
    private TarifsRCService tarifsRCService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile() {
       tarifsRCService.importFromCSV();
        return ResponseEntity.ok("File uploaded and data saved successfully");
    }

    @PostMapping("/calculate")
    public ResponseEntity<Object> calculatePrime(@RequestBody ChapeauPayload payload){
        tarifsRCService.calculatePrime(payload);
        return ResponseEntity.ok(tarifsRCService.calculatePrime(payload));
    }
}
