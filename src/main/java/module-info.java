module hi.verkefni.vidmot {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;

    opens hi.verkefni.vidmot to javafx.fxml, javafx.media;
    exports hi.verkefni.vidmot;
}
