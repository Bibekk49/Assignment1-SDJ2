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
        loader.setLocation(getClass().getResource("/sem2/main.fxml"));
        try {
            Parent root = loader.load();
            MainViewController view = loader.getController();

            if (view != null) {
                view.init(viewModelFactory.getMainViewModel(), this);
                stage.setTitle("Vinyl List");

                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                stage.setResizable(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openSecondView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sem2/second.fxml"));
        try {
            Parent root = loader.load();
            SecondViewController view = loader.getController();
            if (view != null) {
                view.init(viewModelFactory.getSecondViewModel(), this);
                stage.setTitle("Vinyl Detail");

                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                stage.setResizable(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
