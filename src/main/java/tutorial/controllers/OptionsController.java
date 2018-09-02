package tutorial.controllers;

import javafx.fxml.FXML;

public class OptionsController {

    MainController mainController;


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void backMenu(){
        mainController.loadMenuScreen();
    }

}
