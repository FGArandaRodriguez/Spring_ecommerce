package com.example.microservice.repository;

import com.example.microservice.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Logs, Long> {
}
