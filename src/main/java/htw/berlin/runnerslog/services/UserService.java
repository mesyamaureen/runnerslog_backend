package htw.berlin.runnerslog.services;

import htw.berlin.runnerslog.entities.User;
import htw.berlin.runnerslog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public User save(User user) {
     return userRepo.save(user);
    }

    public User get(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public User update(Long id, User user) {
        User currentUser = get(id);
        currentUser.setBenutzername(user.getBenutzername());
        currentUser.setPasswort(user.getPasswort());
        currentUser.setName(user.getName());
        currentUser.setVorname(user.getVorname());
        currentUser.setEmail(user.getEmail());
        return userRepo.save(currentUser);
    }
}
