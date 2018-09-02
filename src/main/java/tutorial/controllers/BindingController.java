package tutorial.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import tutorial.model.PersonViewModel;


public class BindingController {

    @FXML
    private TextField nameTextField;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField surnameTextField;
    @FXML
    private Label surnameLabel;
    @FXML
    private TextField yearTextField;
    @FXML
    private CheckBox confirmCheckBox;
    @FXML
    private Button logginButton;
    @FXML
    private Label ageLabel;
    @FXML
    private PersonViewModel personViewModel = new PersonViewModel();

    @FXML
    public void initialize(){
        nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
        surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());
        surnameTextField.disableProperty().bindBidirectional(personViewModel.getDisableSurnameProperty());

        StringConverter converter = new NumberStringConverter();

        yearTextField.textProperty().bindBidirectional(personViewModel.getYearProperty(), converter);

        confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());

        nameLabel.visibleProperty().bindBidirectional(personViewModel.getNameOkProperty());
        surnameLabel.visibleProperty().bindBidirectional(personViewModel.getSurnameOKProperty());

        logginButton.disableProperty().bindBidirectional(personViewModel.getButtonProperty());


    }


}
