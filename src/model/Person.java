package model;

public class Person {
    private String name;
    private String surname;
    private String phone;


    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }
}