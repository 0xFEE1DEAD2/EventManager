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

    /**
     * Skilar flokki
     *
     * @return flokkur
     */
    public Flokkur getFlokkur() {
        return flokkur;
    }

    /**
     * Skilar dagsetningu
     *
     * @return dagsetning
     */
    public LocalDate getDagsetning() {
        return dagsetning.get();
    }

    /**
     * Property fyrir dagsetningu.
     *
     * @return dagsetning
     */
    public SimpleObjectProperty<LocalDate> dagsetningProperty() {
        return dagsetning;
    }

    /**
     * Skilar tíma
     *
     * @return tími
     */
    public LocalTime getTimi() {
        return timi.get();
    }

    /**
     * Property fyrir tíma
     *
     * @return tími
     */
    public SimpleObjectProperty<LocalTime> timiProperty() {
        return timi;
    }

    /**
     * Skilar kynningarmyndbandi
     *
     * @return kynningarmyndband
     */
    public Media getKynningarmyndband() {
        return kynningarmyndband.get();
    }

    /**
     * Property fyrir kynningarmyndband
     *
     * @return kynningarmyndband
     */
    public SimpleObjectProperty<Media> kynningarmyndbandProperty() {
        return kynningarmyndband;
    }

    /**
     * Skilar heiti viðburðar
     *
     * @return heiti
     */
    public String getHeitiVidburdar() {
        return heitiVidburdar.get();
    }

    /**
     * Property fyrir heiti viðburðar
     *
     * @return heitiVidburdar
     */
    public SimpleStringProperty heitiVidburdarProperty() {
        return heitiVidburdar;
    }
}
