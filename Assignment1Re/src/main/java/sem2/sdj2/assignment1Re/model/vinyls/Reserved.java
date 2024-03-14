package sem2.sdj2.assignment1Re.model.vinyls;

import sem2.sdj2.assignment1Re.view.AlertBox;

public class Reserved implements VinylState{
    @Override
    public void reserve(Vinyl vinyl, String reserver) {
        AlertBox.display("Already reserved.");
    }

    @Override
    public void borrow(Vinyl vinyl, String borrower) {
        if (vinyl.getReserver().equals(borrower)) {
            vinyl.setVinylState(new Borrowed());
            vinyl.setBorrower(borrower);
        }
        else {
            AlertBox.display("Already reserved by another user.");
        }
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setVinylState(new Available());
        vinyl.setReserver(null);
        AlertBox.display("Reservation cancelled.");
    }
}
