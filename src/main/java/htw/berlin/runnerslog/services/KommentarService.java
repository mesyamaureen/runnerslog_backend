package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.Kommentar;
import htw.berlin.runnerslog.repositories.KommentarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KommentarService {
    @Autowired
    KommentarRepository kommentarRepo;

    public Kommentar save(Kommentar kommentar) {
        return kommentarRepo.save(kommentar);
    }

    public List<Kommentar> getKommentare() {
        Iterable<Kommentar> iterator = kommentarRepo.findAll();
        List<Kommentar> kommentare = new ArrayList<Kommentar>();
        for (Kommentar kommentar : iterator) kommentare.add(kommentar);
        return kommentare;
    }
}
