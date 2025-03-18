package hi.verkefni.vidmot;

import javafx.scene.layout.VBox;

public class EventView extends VBox {

    /**
     * Smiður sem hleður inn event-view.fxml.
     * Notar FXML_Lestur til að lesa
     */
    public EventView() {
        FXML_Lestur.lesa(this, "event-view.fxml");
    }
}
