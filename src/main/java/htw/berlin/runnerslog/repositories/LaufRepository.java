package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.Lauf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaufRepository extends CrudRepository<Lauf, Long> {
}
