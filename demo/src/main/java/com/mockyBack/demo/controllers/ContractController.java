package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.ContractHandler;
import com.mockyBack.demo.entities.User;
import com.mockyBack.demo.services.ContractHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/validation/api")
public class ContractController {
    @Autowired
    private ContractHandlerService contractService;
    @PostMapping("/contratvalidator")
    public ResponseEntity<String> validateContract(@RequestBody ContractHandler contract) {
        // Print the received payload to the console
        System.out.println(contract.getTypeClient()  + "erraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        // Save the contract entity
        contractService.saveContract(contract);

        // Return a response
        return ResponseEntity.ok("Contract received and printed to console");
    }
}