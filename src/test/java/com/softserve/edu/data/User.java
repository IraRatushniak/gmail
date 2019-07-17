package com.softserve.edu.data;

interface ILogin {
    IPassword setLogin(String login);
}

interface IPassword {
    IUserBuild setPassword(String password);
}

interface IUserBuild {
    IUser build();
}

public class User implements IUser, IPassword, ILogin, IUserBuild {
    private String login;
    private String password;

    public static ILogin get() {
        return new User();
    }

    @Override
    public IPassword setLogin(String login) {
        this.login = login;
        return this;
    }

    @Override
    public IUserBuild setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public IUser build() {
        return this;
    }
}
