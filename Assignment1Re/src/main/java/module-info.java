module sem.sdj.assignment1re {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    // You need to open the packages containing the controllers to javafx.fxml
    opens sem2.sdj2.assignment1Re.view.mainView to javafx.fxml;
    opens sem2.sdj2.assignment1Re.view.secondView to javafx.fxml;
    // Add additional opens statements for other packages that contain FXML controllers as necessary.

    // Exports the packages that contain the controllers and application entry point.
    exports sem2.sdj2.assignment1Re;
    exports sem2.sdj2.assignment1Re.view.mainView;
    exports sem2.sdj2.assignment1Re.view.secondView;
    // Add additional exports statements for other packages that need to be visible to other modules.
}
