package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.Benutzer;
import htw.berlin.runnerslog.repositories.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenutzerService {
    @Autowired
    BenutzerRepository userRepo;

    public Benutzer save(Benutzer user) {
     return userRepo.save(user);
    }

    public Benutzer get(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Benutzer update(Long id, Benutzer user) {
        Benutzer currentUser = get(id);
        currentUser.setBenutzername(user.getBenutzername());
        currentUser.setPasswort(user.getPasswort());
        currentUser.setName(user.getName());
        currentUser.setVorname(user.getVorname());
        currentUser.setEmail(user.getEmail());
        return userRepo.save(currentUser);
    }
}
