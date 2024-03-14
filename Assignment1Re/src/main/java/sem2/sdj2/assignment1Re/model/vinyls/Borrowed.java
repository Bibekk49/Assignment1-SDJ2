package sem2.sdj2.assignment1Re.model.vinyls;

import sem2.sdj2.assignment1Re.view.AlertBox;

public class Borrowed implements VinylState {
    @Override
    public void reserve(Vinyl vinyl, String reserver) {
        vinyl.setVinylState(new BorrowedAndReserved());
        vinyl.setReserver(reserver);
    }

    @Override
    public void borrow(Vinyl vinyl, String borrower) {
        AlertBox.display("Already borrowed.");
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setVinylState(new Available());
        vinyl.setBorrower(null);
    }
}
