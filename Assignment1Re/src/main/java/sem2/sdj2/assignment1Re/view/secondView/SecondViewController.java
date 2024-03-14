package sem2.sdj2.assignment1Re.view.secondView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;
import sem2.sdj2.assignment1Re.view.AlertBox;
import sem2.sdj2.assignment1Re.view.ViewHandler;
import sem2.sdj2.assignment1Re.viewModel.SecondViewModel;

import java.util.ArrayList;

public class SecondViewController {
    private ViewHandler viewHandler;
    private SecondViewModel viewModel;
    private ArrayList<Vinyl> vinyls;
    @FXML
    private Label title;
    @FXML
    private Label state;
    @FXML
    private TextField name;

    public void init(SecondViewModel secondViewModel, ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
        this.viewModel = secondViewModel;
        title.setText(viewModel.getVinylModel().getSelectedVinyl().getTitle());
        vinyls = viewModel.getVinylModel().getAllVinyls();
        Vinyl selectedVinyl = viewModel.getVinylModel().getSelectedVinyl();
        state.setText(selectedVinyl.getTitle() + " is " + selectedVinyl.getVinylState().toString() +
                " by " + selectedVinyl.getReserver() + " " + selectedVinyl.getBorrower());
    }

    @FXML
    private void returnVinyl() {

        viewModel.returnVinyl();
    }

    @FXML
    public void reserveVinyl(ActionEvent actionEvent) {
        if (name.getText() == null) {
            AlertBox.display("Enter Your Name.");
        }
        viewModel.reserveVinyl(name.getText());
    }

    @FXML
    public void borrowVinyl(ActionEvent actionEvent) {
        if (name.getText() == null) {
            AlertBox.display("Enter Your Name.");
        }
        viewModel.borrowVinyl(name.getText());
    }

    @FXML
    public void back(ActionEvent actionEvent) {
        viewHandler.openMainView();
    }
}
