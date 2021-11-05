package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class user {

    private long id_user;
    private String username;
    private String email;
    private String password;
 
    public user() {
  
    }
 
    public user(String username, String email, String password) {
         this.username = username;
         this.email = email;
         this.password = password;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id_user;
    }
    public void setId(long id) {
        this.id_user = id;
    }
 
    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
 
    @Column(name = "email", nullable = false, unique=true)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user [id_user=" + id_user + ", username=" + username + ", email=" + email + ", password=" + password
       + "]";
    }
 
}
