package hi.verkefni.vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EventManagerApplication extends Application {

    /**
     * Tilviksbreyta sem heldur utan um controller.
     */
    public static EventManagerController controller;

    /**
     * Skilar EventManagerController hlut
     *
     * @return controller
     */
    public static EventManagerController getController() {
        return controller;
    }

    /**
     * Aðalforrit
     *
     * @param stage aðalsvið
     * @throws IOException ef FXML finnst ekki
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EventManagerApplication.class.getResource("eventmanager-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        controller = fxmlLoader.getController();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main til að keyra aðalforrit
     *
     * @param args launch
     */
    public static void main(String[] args) {
        launch();
    }
}