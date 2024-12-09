package com.binary.day6and7;

public class User {
    private String username;
    private  String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username= " + username +
                ", Password= " + password;
    }
}
