package tutorial.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import tutorial.model.Person;


public class PropertiesExampleController {

    @FXML
    private TextField textField;

    @FXML
    private Label labelName;

    private Person person = new Person();

    @FXML
    public void initialize(){
        textField.textProperty().bindBidirectional(person.getPropertyTextField());
        labelName.textProperty().bind(person.getPropertyTextField());
    }

    @FXML
    public void write(){}

}
