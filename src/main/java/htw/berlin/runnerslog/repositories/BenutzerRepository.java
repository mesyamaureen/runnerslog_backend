package htw.berlin.runnerslog.repositories;

import htw.berlin.runnerslog.entities.Benutzer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerRepository extends CrudRepository<Benutzer, Long> {
}
