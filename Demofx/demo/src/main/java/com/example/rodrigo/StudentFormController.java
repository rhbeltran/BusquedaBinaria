package com.example.rodrigo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.models.Student;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class StudentFormController implements Initializable {

    DataSingleton data = DataSingleton.getInstance();
    @FXML TextField idTextField;
    @FXML TextField firstNameTextField;
    @FXML TextField lastNameTextField;
    @FXML TextField emailTextField;
    @FXML TextField phoneTextField;
    @FXML DatePicker birthdayDatePicker;
    @FXML ComboBox levelComboBox;

    ObservableList<Integer> levelItems = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6);
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        levelComboBox.setItems(levelItems);
    }
    @FXML
    private void saveStudent() throws IOException{
        Student student = new Student (idTextField.getText(), firstNameTextField.getText(),
            lastNameTextField.getText(), birthdayDatePicker.getValue(), emailTextField.getText(), 
            phoneTextField.getText(), Integer.parseInt(levelComboBox.getValue().toString()));
        
        data.addStudent(student);
        App.setRoot("studentList");


    }
    @FXML
    private void cancel() throws IOException{
        App.setRoot("studentList");


    }

    
}
