package br.com.thima.gestaovagas.modules.candidate;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID ID;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "o campo não deve conter espaço")
    private String username;
    @Email(message = "Digite um e-mail válido")
    private String email;
    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;
}
