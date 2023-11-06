package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.Laufer;
import org.springframework.data.repository.CrudRepository;

public interface LauferRepository extends CrudRepository<Laufer, Long> {
}
