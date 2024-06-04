package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.Garantie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GarantieRepository extends JpaRepository<Garantie , Integer> {
}
