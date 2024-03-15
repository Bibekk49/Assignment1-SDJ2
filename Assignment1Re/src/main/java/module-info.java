module sem.sdj.assignment1re {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens sem2.sdj2.assignment1Re.view.mainView to javafx.fxml;
    opens sem2.sdj2.assignment1Re.model.vinyls to javafx.base;

    exports sem2.sdj2.assignment1Re;
    exports sem2.sdj2.assignment1Re.view.mainView;
}
