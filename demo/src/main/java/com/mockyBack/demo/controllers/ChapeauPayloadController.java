package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.services.ChapeauPayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disasterRecovery/handlingPayload")
public class ChapeauPayloadController {

    @Autowired
    private ChapeauPayloadService service;

    @PostMapping
    public ChapeauPayload create(@RequestBody ChapeauPayload data) {
        return service.create(data);
    }

    @GetMapping
    public List<ChapeauPayload> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ChapeauPayload findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public ChapeauPayload update(@PathVariable int id, @RequestBody ChapeauPayload data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/allClean")
    public List<ChapeauPayload> getCleanData() {
        return service.getCleanData();
    }

    @PostMapping("/inspectPayload")
    public ResponseEntity<Object> inspectPayload(@RequestBody ChapeauPayload payload) {
        return ResponseEntity.ok(service.inspectPayload(payload));
    }

}
