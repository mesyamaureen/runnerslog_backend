package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Benutzer;
import htw.berlin.runnerslog.services.BenutzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BenutzerController {
    @Autowired
    BenutzerService service;

    @PostMapping("/alleBenutzer")
    public Benutzer createBenutzer(@RequestBody Benutzer benutzer){
        return service.save(benutzer);
    }

    @GetMapping("/alleBenutzer/{id}")
    public Benutzer getBenutzer(@PathVariable String id) {
        Long benutzerId = Long.parseLong(id);
        return service.get(benutzerId);
    }

    @PutMapping("/users/{id}")
    public Benutzer updateBenutzer(@PathVariable Long id, @RequestBody Benutzer benutzer) {
        return service.update(id, benutzer);
    }
}
