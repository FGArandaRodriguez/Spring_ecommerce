package com.example.Ecommerce.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "HistorialCompras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private com.example.Ecommerce.entity.Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private com.example.Ecommerce.entity.Pedido pedido;
    private LocalDateTime fecha = LocalDateTime.now();

    // Getters y Setters
}
