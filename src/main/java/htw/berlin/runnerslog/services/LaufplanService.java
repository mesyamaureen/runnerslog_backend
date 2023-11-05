package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.Lauf;
import htw.berlin.runnerslog.entities.Laufplan;
import htw.berlin.runnerslog.repositories.LaufplanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaufplanService {
    @Autowired
    LaufplanRepository laufplanRepo;

    public Laufplan save(Laufplan laufplan) {
        return laufplanRepo.save(laufplan);
    }

    public Laufplan get(Long id) {
        return laufplanRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Laufplan> getLaufplaene() {
        Iterable<Laufplan> iterator = laufplanRepo.findAll();
        List<Laufplan> laufplaene = new ArrayList<Laufplan>();
        for (Laufplan laufplan : iterator) laufplaene.add(laufplan);
        return laufplaene;
    }

    public Laufplan update(Long id, Laufplan laufplan) {
        Laufplan currentLaufplan = get(id);
        currentLaufplan.setDatum(laufplan.getDatum());
        currentLaufplan.setArt(laufplan.getArt());
        currentLaufplan.setTitel(laufplan.getTitel());
        currentLaufplan.setBeschreibung(laufplan.getBeschreibung());
        currentLaufplan.setStatus(laufplan.getStatus());
        currentLaufplan.setZeit(laufplan.getZeit());
        return laufplanRepo.save(currentLaufplan);
    }

    public boolean delete(Long id) {
        if (!laufplanRepo.existsById(id)) {
            return false;
        }
        laufplanRepo.deleteById(id);
        return true;
    }
}
