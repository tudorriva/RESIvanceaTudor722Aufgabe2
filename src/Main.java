import Controller.Controller;
import Entities.Charakteren;
import Entities.Produkten;
import Repository.IRepository;
import Repository.Repo;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {

        IRepository<Produkten> produkteRepo = new Repo<>();
        IRepository<Charakteren> charackterenRepo = new Repo<>();
        Controller controller = new Controller(produkteRepo, charackterenRepo);
        ConsoleView view = new ConsoleView(controller);

        // Add sample data
        controller.addProdukt("Apfel", 1.5, "Deutschland");
        controller.addProdukt("Banane", 1.2, "Ecuador");
        controller.addPatient("John Doe", "Dorf A");
        controller.addPatient("Jane Doe", "Dorf B");

        // Display the menu
        view.displayMenu();
    }

    }
