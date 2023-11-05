package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.Trainer;
import htw.berlin.runnerslog.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    @Autowired
    TrainerRepository trainerRepo;

    public Trainer save(Trainer trainer) {
        return trainerRepo.save(trainer);
    }

    public Trainer get(Long id) {
        return trainerRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Trainer update(Long id, Trainer trainer) {
        Trainer currentTrainer = get(id);
        currentTrainer.setBenutzername(trainer.getBenutzername());
        currentTrainer.setPasswort(trainer.getPasswort());
        currentTrainer.setName(trainer.getName());
        currentTrainer.setVorname(trainer.getVorname());
        currentTrainer.setEmail(trainer.getEmail());
        return trainerRepo.save(currentTrainer);
    }
}
