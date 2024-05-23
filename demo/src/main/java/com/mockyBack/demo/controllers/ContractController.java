package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.ContractHandler;
import com.mockyBack.demo.entities.User;
import com.mockyBack.demo.services.ContractHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/contractsHandler")
public class ContractController {
    @Autowired
    private ContractHandlerService contractHandlerService;

    @GetMapping
    public List<ContractHandler> getAllContracts() {
        return contractHandlerService.findAll();
    }

    @PostMapping
    public ContractHandler createContractHandler(@RequestBody ContractHandler contractHandler) {
        return contractHandlerService.save(contractHandler);
    }
}
