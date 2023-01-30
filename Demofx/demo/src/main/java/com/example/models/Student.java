package com.example.models;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
public class Student extends Person{
    
    
    
    
    private int level;
   
    
    /**
     * Super Constructor
     * @param id
     * @param firstName
     * @param lastName
     * @param birthday
     * @param email
     * @param phoneNumber
     * @param level
     */
    public Student(String id, String firstName, String lastName, LocalDate birthday, String email, String phoneNumber,
            int level) {
        super(id, firstName, lastName, birthday, email, phoneNumber);
        this.level = level;
    }

    /**
     * Getters & Setters
     * @return getLevel
     */
    public int getLevel() {
        return level;
    }
    /**
     * Getters & Setters
     * @return setLevel
     */
    public void setLevel(int level) {
        this.level = level;
    }
    
    /**
     * print
     * @print Student
     */
    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("Level: "+ this.level);
    }
    
    public SimpleStringProperty idProperty() {
        return new SimpleStringProperty(this.getId());
    }
    public SimpleStringProperty firstNameProperty() {
        return new SimpleStringProperty(this.getFirstname());
    }
    public SimpleStringProperty lastNameProperty() {
        return new SimpleStringProperty(this.getLastname());
    }
    public SimpleStringProperty emailProperty() {
        return new SimpleStringProperty(this.getEmail());
    }
    public SimpleIntegerProperty ageProperty() {
        return new SimpleIntegerProperty(this.getAge());
    }
    
    

} 
    

