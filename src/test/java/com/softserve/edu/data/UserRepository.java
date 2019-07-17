package com.softserve.edu.data;

public class UserRepository {
    public static IUser ira(){
       return User.get().setLogin("SomeNewPerson1@gmail.com").setPassword("12345someperson").build();
    }
}
