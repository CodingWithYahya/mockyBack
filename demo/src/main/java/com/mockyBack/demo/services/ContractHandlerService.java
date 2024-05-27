package com.mockyBack.demo.services;


import com.mockyBack.demo.entities.ContractHandler;
import com.mockyBack.demo.repositories.ContractHandlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  ContractHandlerService {
    @Autowired
    private ContractHandlerRepository contractRepository;

    public ContractHandler saveContract(ContractHandler contract) {
        return contractRepository.save(contract);
    }
}
