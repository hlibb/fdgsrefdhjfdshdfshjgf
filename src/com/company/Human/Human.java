package com.company.Human;

public class Human {
    private String name;
    private String surname;
    private String address;
    private int age;

    public Human(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ","
                + "\nSurname: " + surname + ","
                + "\nAge: " + age + ","
                + "\nAddress: " + address + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Human)) return false;
        Human h = (Human) object;
        return h.name == name
                && h.surname == surname
                && h.age == age
                && h.address == address;
    }

}
