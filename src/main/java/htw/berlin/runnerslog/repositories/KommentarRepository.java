package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.Kommentar;
import org.springframework.data.repository.CrudRepository;

public interface KommentarRepository extends CrudRepository<Kommentar, Long> {
}
