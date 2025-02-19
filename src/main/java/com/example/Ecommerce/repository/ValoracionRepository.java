package com.example.microservice.repository;

import com.example.microservice.entity.Valoraciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepository extends JpaRepository<Valoraciones, Long> {
}
