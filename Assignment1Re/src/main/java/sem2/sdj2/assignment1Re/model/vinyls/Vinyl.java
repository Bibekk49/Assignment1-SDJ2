package sem2.sdj2.assignment1Re.model.vinyls;
public class Vinyl {
    private String title;
    private String artist;
    private int year;
    private VinylState vinylState;
    private String borrower;
    private String reserver;

    private String state;
    public Vinyl(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.vinylState = new Available();
        this.state = "HIII";

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getBorrower() {
        return borrower;
    }

    public VinylState getVinylState() {
        return vinylState;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setVinylState(VinylState vinylState) {
        this.vinylState = vinylState;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public String getReserver() {
        return reserver;
    }
    public void setReserver(String reserver) {
        this.reserver = reserver;
    }
    public void reserve(String reserver) {
        this.vinylState.reserve(this, reserver);
    }
    public void borrow(String borrower) {
        this.vinylState.borrow(this, borrower);
    }
    public void returnVinyl() {
        this.vinylState.returnVinyl(this);
    }
}