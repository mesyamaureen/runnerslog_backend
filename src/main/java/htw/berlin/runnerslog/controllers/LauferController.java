package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Laufer;
import htw.berlin.runnerslog.services.LauferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LauferController {
    @Autowired
    LauferService service;

    @PostMapping("/laufer")
    public Laufer createTrainer(@RequestBody Laufer laufer){
        return service.save(laufer);
    }

    @GetMapping("/alleLaeufer/{id}")
    public Laufer getLaufer(@PathVariable String id) {
        Long lauferId = Long.parseLong(id);
        return service.get(lauferId);
    }

    @PutMapping("/alleLaeufer/{id}")
    public Laufer updateLaufer(@PathVariable Long id, @RequestBody Laufer laufer) {
        return service.update(id, laufer);
    }
}
