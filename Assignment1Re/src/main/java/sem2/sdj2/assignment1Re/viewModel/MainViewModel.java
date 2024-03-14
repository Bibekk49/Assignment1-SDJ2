package sem2.sdj2.assignment1Re.viewModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sem2.sdj2.assignment1Re.model.VinylModel;
import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;
import sem2.sdj2.assignment1Re.view.ViewHandler;

import java.beans.PropertyChangeEvent;

public class MainViewModel {
    private ObservableList<Vinyl> vinylList;
    private VinylModel model;
    private ViewHandler viewHandler;

    public MainViewModel(VinylModel model, ViewHandler viewHandler) {
        vinylList = FXCollections.observableArrayList();
        this.model = model;
        this.viewHandler = viewHandler;
        this.model.addListener("State Changed", this::stateChanged);
        this.model.addListener("Vinyl Removed", this::vinylRemoved);
    }

    private void vinylRemoved(PropertyChangeEvent evt) {
        vinylList.remove((Vinyl) evt.getNewValue());
    }

    private void stateChanged(PropertyChangeEvent evt) {
        vinylList.setAll(model.getAllVinyls());
    }

    public ObservableList<Vinyl> getVinylList() {
        return vinylList;
    }

    public void setSelectedVinyl(Vinyl selectedItem) {
        model.setSelectedVinyl(selectedItem);
    }

    public void removeVinyl(Vinyl vinyl) {
        model.removeVinyl(vinyl);
    }
}
