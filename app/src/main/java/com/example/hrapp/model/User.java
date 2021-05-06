package com.example.hrapp.model;

public class User {
    String name;
    String email;
    String password;
    String hour;
    String number;

    public User(){}

    public User(String name, String email, String password, String hour, String number) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.hour = hour;
        this.number = number;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
