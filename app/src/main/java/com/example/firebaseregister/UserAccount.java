package com.example.firebaseregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserAccount {


    public UserAccount(){

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    private String idToken;
    private String emailId;
    private String password;




}