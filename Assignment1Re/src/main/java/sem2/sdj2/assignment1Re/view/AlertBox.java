package sem2.sdj2.assignment1Re.view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertBox {
    public static void display(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
