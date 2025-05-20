package entity;

import enums.Role;

import java.time.LocalTime;
import java.util.UUID;

public class User {
    private final  String userId = UUID.randomUUID().toString();
    private String name;
    private String surname;
    private String password;
    private String email;
    private Role role;
    private LocalTime ben;
    private LocalTime end;
    private boolean IsConfer;
    private Integer code;
    public User(){}

    public User(String name, String surname, String password, String email, Role role, LocalTime ben, LocalTime end, boolean isConfer, Integer code) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.role = role;
        this.ben = ben;
        this.end = end;
        IsConfer = isConfer;
        this.code = code;
    }

    public String getUserId() {
        return userId;
    }

    public LocalTime getBen() {
        return ben;
    }

    public void setBen(LocalTime ben) {
        this.ben = ben;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public boolean isConfer() {
        return IsConfer;
    }

    public void setConfer(boolean confer) {
        IsConfer = confer;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", ben=" + ben +
                ", end=" + end +
                ", IsConfer=" + IsConfer +
                ", code=" + code +
                '}';
    }
}
