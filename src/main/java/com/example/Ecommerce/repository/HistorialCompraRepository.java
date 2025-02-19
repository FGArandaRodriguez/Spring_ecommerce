package com.example.microservice.repository;

import com.example.microservice.entity.HistorialCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialCompraRepository extends JpaRepository<HistorialCompras, Long> {
}
