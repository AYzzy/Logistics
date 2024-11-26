package E_store.data.repository;

import E_store.data.model.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepo extends MongoRepository<Sender, String> {
}
