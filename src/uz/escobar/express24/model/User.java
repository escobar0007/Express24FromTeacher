package uz.escobar.express24.model;

import uz.escobar.express24.model.enums.Gender;
import uz.escobar.express24.util.CredentialsUtil;

public class User {
    private String name;
    private String phoneNumber;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String password;
    private Gender gender;
    private final Long ID = CredentialsUtil.generateRandomId();

    public Long getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
