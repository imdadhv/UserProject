package org.example.domain.entity;

import org.example.domain.enums.Status;
import org.example.exception.AgeException;
import org.example.exception.PinException;

import java.io.Serializable;
import java.util.Arrays;

import static org.example.util.PatternUtil.checkPin;

public class User implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Integer age;
    private String pin;
    private byte[] password; // TODO
    private Status status = Status.ACTIVE;

    public User() {
    }

    public User(String name, String surname, String email, Integer age, String pin, byte[] password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        try {
            if (age < 18) {
                throw new AgeException("Age must be over 17");
            }
            this.age = age;
        } catch (AgeException e) {
            e.printStackTrace();
        }
        try {
            if (!checkPin(pin)) {
                throw new PinException("Pin should be 8 symbols");
            }
            this.pin = pin;
        } catch (PinException e) {
            e.printStackTrace();
        }
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        try {
            if (age < 18) {
                throw new AgeException("Age must be over 17");
            }
            this.age = age;
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        try {
            if (!checkPin(pin)) {
                throw new PinException("Pin should be 8 symbols");
            }
            this.pin = pin;
        } catch (PinException e) {
            e.printStackTrace();
        }
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", pin='" + pin + '\'' +
                ", password=" + Arrays.toString(password) +
                ", status=" + status +
                '}';
    }
}
