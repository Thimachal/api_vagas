package br.com.thima.gestaovagas.modules.company;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Pattern(regexp = "\\S+", message = "o campo não deve conter espaço")
    private String username;

    @Email(message = "Digite um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "a senha deve conter entre 10 e 100 caracteres")
    private String password;
    private String website;
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
