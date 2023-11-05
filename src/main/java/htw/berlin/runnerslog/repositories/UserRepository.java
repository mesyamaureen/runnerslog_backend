package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
