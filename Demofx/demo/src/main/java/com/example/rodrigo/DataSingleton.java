package com.example.rodrigo;


import java.time.LocalDate;

import com.example.models.Student;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataSingleton {
    private static final DataSingleton instance= new DataSingleton();
    private ObservableList<Student> studentData = FXCollections.observableArrayList(
        new Student ("1717995101","Rodrigo1","Beltran1", LocalDate.of(1994,10,27),"wirrywirry1@hotmail.com","0987575111", 3),
        new Student ("1717995102","Rodrigo2","Beltran2", LocalDate.of(1995,11,28),"wirrywirry2@hotmail.com","0987575112", 4),
        new Student ("1717995103","Rodrigo3","Beltran3", LocalDate.of(1996,12,29),"wirrywirry3@hotmail.com","0987575113", 5),
        new Student ("1717995104","Rodrigo4","Beltran4", LocalDate.of(1997,01,30),"wirrywirry4@hotmail.com","0987575114", 6)
        
    );
private DataSingleton(){}
    public static DataSingleton getInstance() {
        return instance;    
}
public ObservableList<Student> getStudents(){
    return this.studentData;
}
public void addStudent (Student student){
    this.studentData.add(student);
}




}
