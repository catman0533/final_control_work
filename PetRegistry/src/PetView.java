

// View
import java.util.Scanner;



public class PetView {
    public String getTypeInput() {
        System.out.println("Enter the type of pet (dog/cat): ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public String getNameInput() {
        System.out.println("Enter the name of the pet: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public String getCommandInput() {
        System.out.println("Enter a command for the pet: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public String getNewCommandInput() {
        System.out.println("Enter a new command to teach the pet: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public void displayMenu() {
        System.out.println("1. Add a new pet");
        System.out.println("2. Perform a command");
        System.out.println("3. Teach a new command");
        System.out.println("4. Exit");
    }

    public void displayErrorMessage() {
        System.out.println("Invalid input, please try again.");
     }

    public int getUserChoice() {
        return 0;
    }
    }

