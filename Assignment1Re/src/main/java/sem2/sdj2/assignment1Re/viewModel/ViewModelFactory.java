package sem2.sdj2.assignment1Re.viewModel;
import sem2.sdj2.assignment1Re.model.VinylModel;
import sem2.sdj2.assignment1Re.view.ViewHandler;

public class ViewModelFactory {
    private MainViewModel mainViewModel;
    private SecondViewModel secondViewModel;
    private ViewHandler viewHandler;
    private VinylModel model;

    public ViewModelFactory(VinylModel model) {
        this.model=model;
    }

    public MainViewModel getMainViewModel() {
        return mainViewModel;
    }

    public SecondViewModel getSecondViewModel() {
        return secondViewModel;
    }

    public void instantiateViewModels(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
        mainViewModel = new MainViewModel(model,viewHandler);
        secondViewModel = new SecondViewModel(model,viewHandler);
    }
}
