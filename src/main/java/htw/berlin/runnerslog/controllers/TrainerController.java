package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Benutzer;
import htw.berlin.runnerslog.entities.Trainer;
import htw.berlin.runnerslog.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainerController {
    @Autowired
    TrainerService service;

    @PostMapping("/trainer")
    public Trainer createTrainer(@RequestBody Trainer trainer){
        return service.save(trainer);
    }

    @GetMapping("/alleTrainers/{id}")
    public Trainer getTrainer(@PathVariable String id) {
        Long trainerId = Long.parseLong(id);
        return service.get(trainerId);
    }

    @PutMapping("/alleTrainers/{id}")
    public Trainer updateTrainer(@PathVariable Long id, @RequestBody Trainer trainer) {
        return service.update(id, trainer);
    }

}
