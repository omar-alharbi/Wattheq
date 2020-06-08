package com.ELM.stProject.Wattheq.DTO;

public class UserDTO {

    private String userName;
    private String fullName;
    private String dob;
    private String phoneNumber;
    private String email;

    public UserDTO() {
    }
    public UserDTO(String userName,String fullName, String dob, String phoneNumber, String email) {
        this.userName = userName;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
