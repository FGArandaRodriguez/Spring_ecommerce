package com.example.Ecommerce.repository;

import com.example.Ecommerce.entity.HistorialCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialCompraRepository extends JpaRepository<HistorialCompras, Long> {
}
