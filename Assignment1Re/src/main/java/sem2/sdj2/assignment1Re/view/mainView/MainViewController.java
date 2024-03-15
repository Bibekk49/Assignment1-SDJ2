package sem2.sdj2.assignment1Re.view.mainView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sem2.sdj2.assignment1Re.model.vinyls.Vinyl;
import sem2.sdj2.assignment1Re.view.AlertBox;
import sem2.sdj2.assignment1Re.view.ViewHandler;
import sem2.sdj2.assignment1Re.viewModel.MainViewModel;

public class MainViewController {
    @FXML
    private TableView<Vinyl> tableView;
    @FXML
    private TableColumn<Vinyl, String> title;
    @FXML
    private TableColumn<Vinyl, String> artist;
    @FXML
    private TableColumn<Vinyl, Integer> year;
    @FXML
    private TableColumn<Vinyl, String> state;

    private MainViewModel mainViewModel;
    private ViewHandler viewHandler;

    public void init(MainViewModel model, ViewHandler viewHandler) {
        mainViewModel = model;
        this.viewHandler = viewHandler;
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        state.setCellValueFactory(new PropertyValueFactory<>("state"));
        tableView.setItems(mainViewModel.getVinylList());
        tableView.refresh();
    }

    private boolean vinylSelected() {
        return tableView.getSelectionModel().getSelectedItem() == null;
    }

    public void removeVinyl(ActionEvent actionEvent) {
        if (vinylSelected())
            AlertBox.display("Select a vinyl to remove");
        mainViewModel.removeVinyl(tableView.getSelectionModel().getSelectedItem());
    }

    public void next(ActionEvent actionEvent) {
        if (vinylSelected()) {
            AlertBox.display("Select a vinyl to continue");
            return;
        }
        viewHandler.openSecondView();
        mainViewModel.setSelectedVinyl(tableView.getSelectionModel().getSelectedItem());

    }
}
