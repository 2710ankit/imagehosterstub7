package ImageHoster.service;

import ImageHoster.model.User;
import ImageHoster.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User newUser) {

        userRepository.registerUser(newUser);
    }

    public boolean login(User user) {
        if (user.getUsername().equals("ankit") && user.getPassword().equals("asdasdasd"))
            return true;
        else
            return false;
    }

}
