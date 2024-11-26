package E_store.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class TrackingInfo {
    @org.springframework.data.annotation.Id
    private String Id ;
    private String description ;
    private String trackingNumber ;
    private LocalDateTime dateTime = LocalDateTime.now();
}

