package sem2.sdj2.assignment1Re;

import javafx.application.Application;
import javafx.stage.Stage;
import sem2.sdj2.assignment1Re.model.ModelFactory;
import sem2.sdj2.assignment1Re.view.ViewHandler;
import sem2.sdj2.assignment1Re.viewModel.ViewModelFactory;

public class VinylApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory modelFactory = new ModelFactory();
        ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory.getVinylModel());

        ViewHandler viewHandler = new ViewHandler(viewModelFactory,stage);
        viewHandler.start();
    }
}
