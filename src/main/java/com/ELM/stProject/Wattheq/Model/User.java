package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    private int userID;
    @Column(name = "Username", unique = true)
    private String userName;
    @Column(name = "FullName")
    private String fullName;
    @Column(name = "DateOfBirth")
    private String dob;
    @Column(name = "PhoneNumber", unique = true)
    private int phoneNumber;
    @Column(name = "Email", unique = true)
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "NationalID", unique = true)
    private int nationalID;
    @Column(name = "enabled")
    private boolean enable=true;
    @Column(name = "authority")
    private String auth;




    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();

    public User() {}

    public User(int userID, String userName , String fullName, String dob, int phoneNumber, String email, String password, int nationalID , String auth  ) {
        this.userID = userID;
        this.userName = userName;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.nationalID = nationalID;
        this.auth = auth;

    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }



    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) { this.dob = dob; }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

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

    public int getNationalID() {
        return nationalID;
    }
    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }


    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
