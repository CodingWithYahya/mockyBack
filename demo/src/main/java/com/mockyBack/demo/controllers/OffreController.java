package com.mockyBack.demo.controllers;

import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.entities.Garantie;
import com.mockyBack.demo.entities.Offre;
import com.mockyBack.demo.entities.TarifsRC;
import com.mockyBack.demo.services.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disasterRecovery/offres")
public class OffreController {

    @Autowired
    private OffreService offreService;

    @PostMapping("/offre")
    public ResponseEntity<Offre> createOffre(@RequestBody ChapeauPayload payload) {
        Offre offre = offreService.createOffre(payload);
        return new ResponseEntity<>(offre, HttpStatus.CREATED);
    }

//    @GetMapping
//    public ResponseEntity<List<Garantie>> getAllGaranties() {
//        List<Garantie> garanties = OffreService.getAllGaranties();
//        return ResponseEntity.ok(garanties);
//    }

    @GetMapping("/garanties")
    public ResponseEntity<List<Garantie>> getAllGaranties() {
        OffreService offreService = new OffreService(); // Create an instance
        List<Garantie> garanties = offreService.getAllGaranties();
        return ResponseEntity.ok(garanties);
    }
}
