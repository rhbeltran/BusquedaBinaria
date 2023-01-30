package com.example.rodrigo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.models.Student;

/*import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;*/
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class StudentListController implements Initializable {
    DataSingleton data = DataSingleton.getInstance();
    
    
    private ObservableList<Student> studentData = 
    FXCollections.observableArrayList(
       
        );

        @FXML private TableView studentsTableView;
        @FXML private TableColumn idColumn;
        @FXML private TableColumn firstNameColumn;
        @FXML private TableColumn lastNameColumn;
        @FXML private TableColumn emailColumn;
        @FXML private TableColumn ageColumn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        this.idColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        this.firstNameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("firstName"));
        this.lastNameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("lastName"));
        this.emailColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        this.ageColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
        this.studentData= data.getStudents();

        this.studentsTableView.setItems(this.studentData);
    }   

    @FXML
    private void displayStudentForm() throws IOException{
        App.setRoot("studentForm");

    }
}
