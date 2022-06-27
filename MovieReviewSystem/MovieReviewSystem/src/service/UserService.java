package service;

import database.UserRepository;
import exceptions.UserNotFoundException;
import model.User;
import model.UserType;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(String name, String email) {
        return userRepository.addUser(name, email);
    }

    public User getUser(String name) throws UserNotFoundException {
        User user = this.userRepository.getUser(name);
        if (user == null) {
            throw new UserNotFoundException();
        }

        return user;
    }

    public User upgradeUserToCritics(String name) throws UserNotFoundException {
        User user = this.userRepository.getUser(name);
        if (user == null) {
            throw new UserNotFoundException();
        }

        user.setUserType(UserType.CRITICS);
        return this.userRepository.updateUser(user);
    }
}
