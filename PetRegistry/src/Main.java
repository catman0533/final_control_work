



// Main
public class Main {
    public static void main(String[] args) {
        PetView view = new PetView();
        Pet pet = new Pet("", "");
        PetPresenter presenter = new PetPresenter(pet, view);
        presenter.start();
    }
}