package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Laufplan;
import htw.berlin.runnerslog.services.LaufplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaufplanController {
    @Autowired
    LaufplanService service;

    @PostMapping("/alleLaufplaene")
    public Laufplan createLaufplan(@RequestBody Laufplan laufplan) {
        return service.save(laufplan);
    }

    @GetMapping("/alleLaufplaene/{id}")
    public Laufplan getLaufplan(@PathVariable String id) {
        Long laufplanId = Long.parseLong(id);
        return service.get(laufplanId);
    }

    @GetMapping("/alleLaufplaene")
    public List<Laufplan> getLaufplaene() {
        return service.getLaufplaene();
    }

    @PutMapping("/alleLaufplaene/{id}")
    public Laufplan updateLaufplan(@PathVariable Long id, @RequestBody Laufplan laufplan) {
        return service.update(id, laufplan);
    }

    @DeleteMapping("/alleLaufplaene/{id}")
    public boolean deleteLaufplan(@PathVariable String id) {
        Long laufplanId = Long.parseLong(id);
        return service.delete(laufplanId);
    }
}
