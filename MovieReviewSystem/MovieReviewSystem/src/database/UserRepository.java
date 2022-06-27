package database;

import model.Movie;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    Map<String, User> userMap;

    public UserRepository() {
        userMap = new HashMap<>();
    }

    public User addUser(String name, String email) {
        User user = new User(name, email);
        this.userMap.put(name, user);

        return user;
    }

    public User getUser(String name) {
        User user = null;
        if (this.userMap.containsKey(name)) {
            user = this.userMap.get(name);
        }

        return user;
    }

    public User updateUser(User user) {
        if (user != null) {
            this.userMap.put(user.getName(), user);
        }

        return user;
    }

}
