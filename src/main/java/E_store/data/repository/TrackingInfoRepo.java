package E_store.data.repository;

import E_store.data.model.TrackingInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingInfoRepo extends MongoRepository<TrackingInfo, String> {
}
