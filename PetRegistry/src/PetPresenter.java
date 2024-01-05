//import java.util.Scanner;
// Presenter
class PetPresenter {
    private Pet pet;
    private PetView view;

    public PetPresenter(Pet pet, PetView view) {
        this.pet = pet;
        this.view = view;
    }

    public void start() {
        int choice;
        do {
            view.displayMenu();
            choice = view.getUserChoice();
            switch (choice) {
                case 1:
                    String name = view.getNameInput();
                    String type = view.getTypeInput();
                    pet = new Pet(name, type);
                    break;
                case 2:
                    if (pet != null) {
                        String command = view.getCommandInput();
                        pet.performCommand(command);
                    } else {
                        view.displayErrorMessage();
                    }
                    break;
                case 3:
                    if (pet != null) {
                        String newCommand = view.getNewCommandInput();
                        pet.teachCommand(newCommand);
                    } else {
                        view.displayErrorMessage();
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    view.displayErrorMessage();
                    break;
            }
        } while (choice != 4);
    }
}




