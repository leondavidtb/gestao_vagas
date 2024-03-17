package br.com.leonardo.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;
@Data
public class CandidateEntity {
    private UUID id;

    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "Field [username] must not contain blank space")
    private String username;

    @Email(message = "Field [email] is not valid")
    private String email;

    @Length(min = 8, message = "Field [password] must be at least 8 characters")
    private String password;

    private String description;

    private String curriculum;
}
