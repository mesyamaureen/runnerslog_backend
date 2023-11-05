package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Trainer;
import htw.berlin.runnerslog.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
    @Autowired
    TrainerService service;

    @PostMapping("/trainers")
    public Trainer createTrainer(@RequestBody Trainer trainer){
        return service.save(trainer);
    }
}
