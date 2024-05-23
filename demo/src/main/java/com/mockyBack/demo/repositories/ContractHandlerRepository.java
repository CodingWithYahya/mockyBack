package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.ContractHandler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContractHandlerRepository extends JpaRepository<ContractHandler, Integer> {
}
