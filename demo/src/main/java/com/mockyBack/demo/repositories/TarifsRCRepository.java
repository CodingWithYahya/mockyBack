package com.mockyBack.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifsRCRepository extends JpaRepository<com.mockyBack.demo.entities.TarifsRC, Long> {
}
