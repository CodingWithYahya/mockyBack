package com.mockyBack.demo.repositories;


import com.mockyBack.demo.entities.StoreDataFromChapeau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDataFromChapeauRepository extends JpaRepository<StoreDataFromChapeau, Integer> {
}
