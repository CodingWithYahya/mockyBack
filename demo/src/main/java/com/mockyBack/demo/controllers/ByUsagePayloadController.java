package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.ByUsagePayload;
import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.services.ByUsagePayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disasterRecovery/handlingByUsagePayload")
public class ByUsagePayloadController {

    @Autowired
    private ByUsagePayloadService service ;

    @PostMapping
    public ByUsagePayload create(@RequestBody ByUsagePayload data) {
        return service.create(data);
    }

    @GetMapping
    public List<ByUsagePayload> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ByUsagePayload findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/inspectPayload")
    public Object inspectPayload(@RequestBody ByUsagePayload payload) {
        return service.inspectPayload(payload);
    }
}
