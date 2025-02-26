package com.example.Ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DetallesPedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallesPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private com.example.Ecommerce.entity.Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private com.example.Ecommerce.entity.Producto producto;
    private Integer cantidad;
    private Double precio;

    // Getters y Setters
}
