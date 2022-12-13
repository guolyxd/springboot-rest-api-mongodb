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

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "BaseDocument{" +
//                "id='" + id + '\'' +
//                '}';
//    }

}
