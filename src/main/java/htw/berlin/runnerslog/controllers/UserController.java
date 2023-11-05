package htw.berlin.runnerslog.controllers;

import htw.berlin.runnerslog.entities.User;
import htw.berlin.runnerslog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return service.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        Long userId = Long.parseLong(id);
        return service.get(userId);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }
}
