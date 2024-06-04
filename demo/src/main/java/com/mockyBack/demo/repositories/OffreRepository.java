package com.mockyBack.demo.repositories;


import com.mockyBack.demo.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepository extends JpaRepository <Offre , Integer> {
}
