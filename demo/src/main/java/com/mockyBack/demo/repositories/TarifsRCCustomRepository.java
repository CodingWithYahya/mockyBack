package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.ChapeauPayload;
import org.springframework.stereotype.Repository;

public interface TarifsRCCustomRepository {
    Double calculatePrime(ChapeauPayload payload);
}