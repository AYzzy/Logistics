package E_store.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Sender {
    @org.springframework.data.annotation.Id
    private String Id ;
    private String phoneNumber ;
    private String name ;
}
