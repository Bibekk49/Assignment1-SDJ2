module sem2.sdj2.assignment1re {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sem2.sdj2.assignment1Re to javafx.fxml;
    exports sem2.sdj2.assignment1Re;
}