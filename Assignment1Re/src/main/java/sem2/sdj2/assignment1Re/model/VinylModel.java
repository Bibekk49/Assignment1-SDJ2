package sem2.sdj2.assignment1Re.model;

import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public interface VinylModel {
    void addListener(String eventName, PropertyChangeListener listener);

    void reserveVinyl(Vinyl vinyl, String reserver);

    void borrowVinyl(Vinyl vinyl, String borrower);

    Vinyl getSelectedVinyl();

    void setSelectedVinyl(Vinyl vinyl);

    void returnVinyl(Vinyl vinyl);

    ArrayList<Vinyl> getAllVinyls();

    void removeVinyl(Vinyl vinyl);
}

