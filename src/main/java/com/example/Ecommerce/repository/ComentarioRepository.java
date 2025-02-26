package com.example.Ecommerce.repository;

import com.example.Ecommerce.entity.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentarios, Long> {
}
