package com.basic.encapsulation;

public class Facebook {
    private String userName = "AgiraTech";
    private int userId = 123;
    private String password = "Agira@123";

    public String getUserName() {
        return userName;
    }

    public int getUserId() {

        return userId;
    }

    public String getPassword() {

        return password;
    }

    public void setUserName(String userName){

        this.userName =userName;
    }
    public void setPassword(String password){

        this.password =password;
    }
    public void setUserId(int userId){

        this.userId =userId;
    }

}
