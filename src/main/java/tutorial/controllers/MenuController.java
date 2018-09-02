package tutorial.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    private MainController mainController;


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


    @FXML
    public void openApplication() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
        Pane pane = getPane(loader);

        AppController appController = loader.getController();
        appController.setMainController(mainController);
        mainController.setScreen(pane);

    }

    @FXML
    public void openOptions() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
        Pane pane = getPane(loader);

        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScreen(pane);

    }

    @FXML
    public void exit() {
        Platform.exit();
    }

    private Pane getPane(FXMLLoader loader) {
        Pane pane = null;

        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pane;
    }

}
