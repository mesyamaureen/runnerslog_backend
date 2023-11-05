package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.Lauf;
import htw.berlin.runnerslog.entities.Laufplan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaufplanRepository extends CrudRepository<Laufplan, Long> {
}
