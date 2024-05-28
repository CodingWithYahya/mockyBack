package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.StoreDataFromChapeau;
import com.mockyBack.demo.services.StoreDataFromChapeauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/validation/api/contractHandler")
public class StoreDataFromChapeauController {

    @Autowired
    private StoreDataFromChapeauService service;

    @PostMapping
    public StoreDataFromChapeau create(@RequestBody StoreDataFromChapeau data) {
        return service.create(data);
    }

    @GetMapping
    public List<StoreDataFromChapeau> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public StoreDataFromChapeau findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public StoreDataFromChapeau update(@PathVariable int id, @RequestBody StoreDataFromChapeau data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/allClean")
    public List<StoreDataFromChapeau> getCleanData() {
        return service.getCleanData();
    }

    @GetMapping("/calculatePrice")
    public double calculatePrice(@RequestBody StoreDataFromChapeau data) {
        return service.calculatePrice(data);
    }

    @PostMapping("/savePayload")
    public ResponseEntity<Object> inspectPayload(@RequestBody StoreDataFromChapeau payload) {
        service.create(payload); //
        return ResponseEntity.ok(service.inspectPayload(payload));
    }
}
