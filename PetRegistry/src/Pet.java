



// Model
public class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void performCommand(String command) {
        if ("dog".equals(type)) {
            // реализация команд для собаки
            System.out.println(name + " performs command: " + command);
        } else if ("cat".equals(type)) {
            // реализация команд для кошки
            System.out.println(name + " ignores command: " + command);
        }
    }

    public void teachCommand(String newCommand) {
        if ("dog".equals(type)) {
            // обучение команды собаке
            System.out.println(name + " learns new command: " + newCommand);
        } else {
            System.out.println(name + " can't learn new command");
        }
    }
}
