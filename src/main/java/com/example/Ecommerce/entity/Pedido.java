package com.example.microservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "Pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private Double total;
    @Enumerated(EnumType.STRING)
    private EstadoPedido estado = EstadoPedido.PENDIENTE;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    // Getters y Setters
}

enum EstadoPedido {
    PENDIENTE, PROCESADO, ENVIADO, ENTREGADO, CANCELADO
}
