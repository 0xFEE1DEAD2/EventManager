package hi.verkefni.vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

/**
 * Controller fyrir valmynd MenuBar.
 * Sem er efst á eventmanager-view glugganum.
 */
public class MenuController {

    /**
     * Handler sem er kallaður þegar notandi velur Close,
     * undir File.
     *
     * @param actionEvent viðbruður frá Close
     */
    @FXML
    private void OnClose(ActionEvent actionEvent) {
        System.out.println("Virkar");
        EventManagerController controller = EventManagerApplication.getController();
        controller.onTest();
    }

    /**
     * Handler sem er kallaður þegar notandi velur Delete,
     * undir Edit.
     *
     * @param actionEvent viðburður frá Delete
     */
    @FXML
    private void OnDelete(ActionEvent actionEvent) {
        System.out.println("virkar");
    }

    /**
     * Handler fyrir About,
     * undir Help.
     *
     * @param actionEvent viðburður frá Help
     */
    @FXML
    private void OnAbout(ActionEvent actionEvent) {
        System.out.println("virkar");
    }
}
