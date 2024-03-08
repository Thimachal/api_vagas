package br.com.thima.gestaovagas.modules.candidate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.util.UUID;
@Data
public class CandidateEntity {

    private UUID ID;
    private String name;
    @Pattern(regexp = "\\S+", message = "o campo não deve conter espaço")
    private String username;
    @Email(message = "Digite um e-mail válido")
    private String email;
    @Length(min = 10, max = 100, message = " a senha deve conter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String curriculum;
}
