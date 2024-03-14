package sem2.sdj2.assignment1Re.model.vinyls;

public interface VinylState {
    void reserve(Vinyl vinyl , String reserver);
    void borrow(Vinyl vinyl, String borrower);
    void returnVinyl(Vinyl vinyl);
}
