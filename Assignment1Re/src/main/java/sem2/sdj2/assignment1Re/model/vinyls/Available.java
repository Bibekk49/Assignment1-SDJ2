package sem2.sdj2.assignment1Re.model.vinyls;

import sem2.sdj2.assignment1Re.view.AlertBox;

public class Available implements VinylState {
    @Override
    public void reserve(Vinyl vinyl, String reserver) {
        vinyl.setVinylState(new Reserved());
        vinyl.setReserver(reserver);
    }

    @Override
    public void borrow(Vinyl vinyl, String borrower) {
        vinyl.setVinylState(new Borrowed());
        vinyl.setBorrower(borrower);
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        AlertBox.display("Already available.");
    }
}
