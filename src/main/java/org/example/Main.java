package org.example;

public class Main {
    public static void main(String[] args) {
        UserDatabaseOperations userDb = new UserDatabaseOperations();
        User user1 = new User(1, "Pavel Durov");
        User user2 = new User(2, "Bill Gates");


        userDb.save(user1);
        userDb.save(user2);
        System.out.println(userDb.get(1));
        userDb.delete(user2);

    }
}