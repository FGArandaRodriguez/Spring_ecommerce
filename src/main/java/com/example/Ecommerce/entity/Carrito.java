package com.example.Ecommerce.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "Carrito")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private com.example.Ecommerce.entity.Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private com.example.Ecommerce.entity.Producto producto;
    private Integer cantidad;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    // Getters y Setters
}
