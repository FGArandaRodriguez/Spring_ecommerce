package com.example.Ecommerce.repository;

import com.example.Ecommerce.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pagos, Long> {
}
