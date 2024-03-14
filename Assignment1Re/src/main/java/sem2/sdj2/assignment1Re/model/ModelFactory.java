package sem2.sdj2.assignment1Re.model;

public class ModelFactory {
    private VinylModel vinylModel;
    public VinylModel getVinylModel(){
        if (vinylModel==null)
            vinylModel=new VinylModelManager();
        return vinylModel;
    }
}
