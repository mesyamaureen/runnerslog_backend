package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.Laufer;
import htw.berlin.runnerslog.repositories.LauferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LauferService {
    @Autowired
    LauferRepository lauferRepo;

    public Laufer save(Laufer laufer) {
        return lauferRepo.save(laufer);
    }

    public Laufer get(Long id) {
        return lauferRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Laufer update(Long id, Laufer laufer) {
        Laufer currentLaufer = get(id);
        currentLaufer.setBenutzername(laufer.getBenutzername());
        currentLaufer.setPasswort(laufer.getPasswort());
        currentLaufer.setName(laufer.getName());
        currentLaufer.setVorname(laufer.getVorname());
        currentLaufer.setEmail(laufer.getEmail());
        currentLaufer.setGroesse(laufer.getGroesse());
        currentLaufer.setGewicht(laufer.getGewicht());
        currentLaufer.setGeschlecht(laufer.getGeschlecht());
        currentLaufer.setGeburtsDatum(laufer.getGeburtsDatum());
        return lauferRepo.save(currentLaufer);
    }
}
