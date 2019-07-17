package com.softserve.edu.data;

/**
 * Here we have class for creating
 * users, with which we will have possibility to login.
 */
public class UserRepository {
    public static IUser ira() {
        return User.get().setLogin("SomeNewPerson1@gmail.com")
                .setPassword("12345someperson").build();
    }
}
