package com.example.microservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String contrasena;
    private String telefono;
    private String direccion;
    @Enumerated(EnumType.STRING)
    private Rol rol = Rol.CLIENTE;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    // Getters y Setters
}

enum Rol {
    CLIENTE, ADMIN, VENDEDOR
}
