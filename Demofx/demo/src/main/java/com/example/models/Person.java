package com.example.models;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
public class Person{

    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String phoneNumber;
    /**
     * Constructor
     * @param id
     * @param firstname
     * @param lastname
     * @param birthday
     * @param email
     * @param phoneNumber
     */
    public Person(String id, String firstName, String lastName, LocalDate birthday, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    /**
     * Getters & Setters
     * @return getId
     */
    public String getId() {
        return id;
    }
    /**
     * Getters & Setters
     * @return setId
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Getters & Setters
     * @return getFirstname
     */
    public String getFirstname() {
        return firstName;
    }
    /**
     * Getters & Setters
     * @return setFirstname
     */
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Getters & Setters
     * @return getLastname
     */
    public String getLastname() {
        return lastName;
    }
    /**
     * Getters & Setters
     * @return setLastname
     */
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Getters & Setters
     * @return getBirthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }
    /**
     * Getters & Setters
     * @return setBirthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    /**
     * Getters & Setters
     * @return getEmail
     */
    public String getEmail() {
        return email;
    }
    /**
     * Getters & Setters
     * @return setEmail
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Getters & Setters
     * @return getPhoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Getters & Setters
     * @return setPhoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * get the fullName
     * @return getFullname
     */
    public String getFullname(){
        return firstName+" "+lastName;
    }
    /**
     * get the age
     * @return getAge
     */
    public int getAge(){
        Period age = Period.between(birthday, LocalDate.now());
        return age.getYears();//retorna este valor en la funcion, 
        //por eso se dejo vacio los parentesis de la funcion
    }
    /**
     * Prints person data
     * @print Person
     */
    public void print(){
        System.out.println("       *****"+this.getFullname()+"*****");
        System.out.println();
        System.out.println(getId());
        System.out.println("ID: " + this.id);
        System.out.println("Birthday: "+ this.birthday);
        System.out.println("Age: "+this.getAge());
        System.out.println("Email: "+ this.email);
        System.out.println("phoneNumber: "+ this.phoneNumber);
        System.out.println(birthday);
        System.out.println(String.format("%d años ", getAge()));
        System.out.println();

    }

}