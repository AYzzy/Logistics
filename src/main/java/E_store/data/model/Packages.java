package E_store.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Packages {
    @org.springframework.data.annotation.Id
    private String Id ;
    private String description ;
    private int quantity ;
    private int deliveryFee ;
    @DBRef
    private Sender sender;
    @DBRef
    private Receiver receiver;
    private LocalDateTime dateTime = LocalDateTime.now();
}
