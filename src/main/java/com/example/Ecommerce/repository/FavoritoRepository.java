package com.example.microservice.repository;

import com.example.microservice.entity.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<Favoritos, Long> {
}
