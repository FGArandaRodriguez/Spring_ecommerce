package com.example.microservice.repository;

import com.example.microservice.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pagos, Long> {
}
