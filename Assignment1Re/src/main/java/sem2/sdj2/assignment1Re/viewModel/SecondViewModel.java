package sem2.sdj2.assignment1Re.viewModel;

import sem2.sdj2.assignment1Re.model.VinylModel;
import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;
import sem2.sdj2.assignment1Re.view.ViewHandler;

import java.beans.PropertyChangeEvent;

public class SecondViewModel {
    private VinylModel vinylModel;

    public SecondViewModel(VinylModel model, ViewHandler viewHandler) {
        model.addListener("Update", this::update);
    }

    private void update(PropertyChangeEvent evt) {
        Vinyl newValue = (Vinyl) evt.getNewValue();
    }

    public void reserveVinyl(String reserver) {
        vinylModel.reserveVinyl(vinylModel.getSelectedVinyl(), reserver);
    }

    public void borrowVinyl(String borrower) {
        vinylModel.borrowVinyl(vinylModel.getSelectedVinyl(), borrower);
    }

    public void returnVinyl() {
        vinylModel.returnVinyl(vinylModel.getSelectedVinyl());
    }

    public VinylModel getVinylModel() {
        return vinylModel;
    }
}
