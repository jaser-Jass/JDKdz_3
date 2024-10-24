package org.example;
import java.util.HashMap;
import java.util.Map;
public class UserDatabaseOperations implements  DatabaseOperations<User>{
    private Map<Integer, User> userDatabase = new HashMap<>();
    private int currentId = 1;

    @Override
    public void save(User user) {
        user.setId(currentId++);
        userDatabase.put(user.getId(), user);
        System.out.println("User saved: " + user);
    }

    @Override
    public void delete(User user) {
        userDatabase.remove(user.getId());
        System.out.println("User deleted: " + user);
    }

    @Override
    public User get(int id) {
        return userDatabase.get(id);
    }
}
