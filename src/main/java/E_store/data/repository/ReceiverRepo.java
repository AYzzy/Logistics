package E_store.data.repository;

import E_store.data.model.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepo extends MongoRepository<Receiver, String> {
}
