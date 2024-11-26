package E_store.data.repository;

import E_store.data.model.Packages;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackageRepo extends MongoRepository<Packages, String> {
}
