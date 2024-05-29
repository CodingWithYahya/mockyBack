package com.mockyBack.demo.repositories;


import com.mockyBack.demo.entities.ChapeauPayload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapeauPayloadRepository extends JpaRepository<ChapeauPayload, Integer> {
}
