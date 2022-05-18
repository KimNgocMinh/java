package lesson9;

import java.util.*;

public class UserManagement {
    private List<User> users = new ArrayList<>();
    private Map<String, String> data = new HashMap<>();

    public UserManagement() {
    }

    public void addUser(User user) {
        users.add(user);
        data.put(user.getUserName(), user.getPassword());
    }

    public User login(String userName,String password) {
        for (User user : users) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) return user;
        }
        return null;
    }

    public User findUserByUsername(String userName){
        for (User user : users) {
            if(user.getUserName().equals(userName)) return user;
        }
        return null;
    }
}
