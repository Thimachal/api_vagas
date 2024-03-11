package br.com.thima.gestaovagas.modules.company;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String website;
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
