package example.api.rest.errors;

import org.springframework.http.HttpStatus;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Error response.
 */
@Data
public class ErrorResponse {

    private HttpStatus status;

    private String message;

    private List<String> errors;

    public ErrorResponse(HttpStatus status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ErrorResponse(HttpStatus status, String message, String error) {
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(error);
    }

}
