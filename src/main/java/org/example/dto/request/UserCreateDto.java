package org.example.dto.request;

public class UserCreateDto {
    private String name;
    private String surname;
    private String email;
    private Integer age;
    private String pin;
    private String password;

    public UserCreateDto(String name, String surname, String email, Integer age, String pin, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.pin = pin;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
