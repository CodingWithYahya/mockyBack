package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.ByUsagePayload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ByUsagePayloadRepository extends JpaRepository<ByUsagePayload, Integer> {
}
