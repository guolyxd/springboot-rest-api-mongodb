package example.api.rest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import static example.api.rest.utils.ApiConstants.CAMPAIGNS_SEQUENCE_NAME;

/**
 * Campaign model collection.
 */

@Data
@Document(collection = "campaigns")
@JsonIgnoreProperties(value="campaignStatus", allowGetters= true, ignoreUnknown = true)
public class Campaign extends BaseDocument {

    @Transient
    public static final String SEQUENCE_NAME = CAMPAIGNS_SEQUENCE_NAME;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @URL(message = "Url should be valid")
    private String url;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Description is mandatory")
    private String description;

    private CampaignStatusType campaignStatus = CampaignStatusType.OPEN;

    public Campaign () {
    }

}
