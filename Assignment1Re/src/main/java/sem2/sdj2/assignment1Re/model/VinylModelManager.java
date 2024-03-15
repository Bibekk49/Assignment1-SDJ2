package sem2.sdj2.assignment1Re.model;

import sem2.sdj2.assignment1Re.model.vinyls.Available;
import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;
import sem2.sdj2.assignment1Re.view.AlertBox;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;


public class VinylModelManager implements VinylModel {
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private Vinyl selectedVinyl;
    private ArrayList<Vinyl> vinyls;
    String title[] = {"Vinyl1", "Vinyl2", "Vinyl3", "Vinyl4", "Vinyl5", "Vinyl6",
            "Vinyl7", "Vinyl8", "Vinyl9", "Vinyl10"};
    String artists[] = {"Aritist1", "Aritist2", "Aritist3", "Aritist4",
            "Aritist5", "Aritist6", "Aritist7", "Aritist8", "Aritist9", "Aritist10"};

    public VinylModelManager() {
        vinyls = new ArrayList<>();
        initList();
    }

    @Override
    public void reserveVinyl(Vinyl vinyl, String reserver) {
        vinyl.reserve(reserver);
        support.firePropertyChange("Reserve", null, vinyl);
    }

    @Override
    public void borrowVinyl(Vinyl vinyl, String borrower) {
        vinyl.borrow(borrower);
        support.firePropertyChange("Borrow", null, vinyl);
    }


    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.returnVinyl();
        support.firePropertyChange("Return", null, vinyl);
    }

    @Override
    public void removeVinyl(Vinyl vinyl) {
        if (vinyl.getVinylState() instanceof Available) {
            vinyls.remove(vinyl);
            support.firePropertyChange("Remove", null, vinyl);
        } else {
            AlertBox.display("Cant remove the vinyl");
        }
    }

    @Override
    public ArrayList<Vinyl> getAllVinyls() {
        if (vinyls == null) {
            initList();
        }
        return vinyls;
    }

    @Override
    public Vinyl getSelectedVinyl() {
        return selectedVinyl;
    }

    @Override
    public void setSelectedVinyl(Vinyl vinyl) {
        this.selectedVinyl = vinyl;
    }

    @Override
    public void addListener(String eventName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(eventName, listener);
    }

    private void initList() {
        for (int i = 0; i < 10; i++) {
            vinyls.add(new Vinyl(title[i % (title.length)], artists[i % (artists.length)], (2000 + (i * 2))));
        }
    }
}
