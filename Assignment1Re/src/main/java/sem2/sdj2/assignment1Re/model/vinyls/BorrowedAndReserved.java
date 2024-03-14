package sem2.sdj2.assignment1Re.model.vinyls;

import sem2.sdj2.assignment1Re.view.AlertBox;

public class BorrowedAndReserved implements VinylState {

    @Override
    public void reserve(Vinyl vinyl, String reserver) {
        AlertBox.display("Can't reserve");
    }

    @Override
    public void borrow(Vinyl vinyl, String borrower) {
        AlertBox.display("Can't borrow.");
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setVinylState(new Reserved());
        vinyl.setBorrower(null);
    }
}
