package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.Kommentar;
import htw.berlin.runnerslog.services.KommentarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KommentarController {
    @Autowired
    KommentarService service;

    @PostMapping("/alleKommentare")
    public Kommentar createKommentar(@RequestBody Kommentar kommentar) { return service.save(kommentar); }

    @GetMapping("/alleKommentare")
    public List<Kommentar> getKommentare() {
        return service.getKommentare();
    }
}
