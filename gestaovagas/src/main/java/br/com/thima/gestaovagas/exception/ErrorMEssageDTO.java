package br.com.thima.gestaovagas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMEssageDTO {

    private String message;
    private String field;
}
