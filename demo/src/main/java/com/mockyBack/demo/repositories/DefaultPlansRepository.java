package com.mockyBack.demo.repositories;

import com.mockyBack.demo.entities.DefaultPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultPlansRepository extends JpaRepository<DefaultPlans, Long> {
}
