package com.example.firebaseregister;

public class Users {

    String userId, name, progile;

    public Users(String userId, String name, String progile) {
        this.userId = userId;
        this.name = name;
        this.progile = progile;
    }

    public Users() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgile() {
        return progile;
    }

    public void setProgile(String progile) {
        this.progile = progile;
    }
}
