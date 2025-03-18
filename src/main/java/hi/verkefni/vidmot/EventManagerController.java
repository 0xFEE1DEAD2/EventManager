package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EventManagerController {
    @FXML
    private Label fxTest;

    /**
     * Dummy test til að sjá hvort boð sendist úr MenuController.
     * Virkar.
     */
    public void onTest() {
        fxTest.setText("Prufa virkar");
    }
}