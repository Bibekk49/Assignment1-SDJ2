package sem2.sdj2.assignment1Re.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sem2.sdj2.assignment1Re.view.mainView.MainViewController;
import sem2.sdj2.assignment1Re.view.secondView.SecondViewController;
import sem2.sdj2.assignment1Re.viewModel.ViewModelFactory;

import java.io.IOException;

public class ViewHandler {
    private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(ViewModelFactory viewModelFactory, Stage stage) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
        viewModelFactory.instantiateViewModels(this);
    }

    public void start() {
        openMainView();
    }

    public void openMainView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../mainView/main.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MainViewController view = loader.getController();
        view.init(viewModelFactory.getMainViewModel(), this);
        stage.setTitle("Vinyl List");

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openSecondView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../secondView/second.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SecondViewController view = loader.getController();
        view.init(viewModelFactory.getSecondViewModel(), this);
        stage.setTitle("");

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
