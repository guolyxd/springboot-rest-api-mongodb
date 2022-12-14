package example.api.rest.models;

import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * Base document.
 */
@Data
public abstract class BaseDocument {

    @Id
    private String id;

}
