package com.example.microservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "Logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String accion;
    private LocalDateTime fecha = LocalDateTime.now();

    // Getters y Setters
}
