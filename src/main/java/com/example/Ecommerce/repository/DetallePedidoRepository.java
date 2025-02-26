package com.example.Ecommerce.repository;

import com.example.Ecommerce.entity.DetallesPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallesPedido, Long> {
}
