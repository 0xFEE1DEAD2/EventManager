package hi.verkefni.vinnsla;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

import javax.print.attribute.standard.Media;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EventModel {

    private Flokkur flokkur;
    private final SimpleStringProperty heitiVidburdar = new SimpleStringProperty();
    private final SimpleObjectProperty<LocalDate> dagsetning = new SimpleObjectProperty<>(LocalDate.now());
    private final SimpleObjectProperty<LocalTime> timi = new SimpleObjectProperty<>(LocalTime.now());
    private final SimpleObjectProperty<Media> kynningarmyndband = new SimpleObjectProperty<>();

    public Flokkur getFlokkur() {
        return flokkur;
    }

    public LocalDate getDagsetning() {
        return dagsetning.get();
    }

    public SimpleObjectProperty<LocalDate> dagsetningProperty() {
        return dagsetning;
    }

    public LocalTime getTimi() {
        return timi.get();
    }

    public SimpleObjectProperty<LocalTime> timiProperty() {
        return timi;
    }

    public Media getKynningarmyndband() {
        return kynningarmyndband.get();
    }

    public SimpleObjectProperty<Media> kynningarmyndbandProperty() {
        return kynningarmyndband;
    }

    public String getHeitiVidburdar() {
        return heitiVidburdar.get();
    }

    public SimpleStringProperty heitiVidburdarProperty() {
        return heitiVidburdar;
    }
}
