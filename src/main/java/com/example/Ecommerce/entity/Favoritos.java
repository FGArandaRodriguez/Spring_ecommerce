package com.example.microservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "Favoritos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
    private LocalDateTime fechaAgregado = LocalDateTime.now();

    // Getters y Setters
}
