package View;

import Controller.Controller;
import Entities.Produkten;
import Entities.Charakteren;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final Controller controller;
    private final Scanner scanner;

    public ConsoleView(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Add Produkt");
            System.out.println("2. Update Produkt");
            System.out.println("3. Delete Produkt");
            System.out.println("4. List All Produkten");
            System.out.println("5. Add Patient");
            System.out.println("6. Update Patient");
            System.out.println("7. Delete Patient");
            System.out.println("8. List All Patienten");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addProdukt();
                    break;
                case 2:
                    updateProdukt();
                    break;
                case 3:
                    deleteProdukt();
                    break;
                case 4:
                    listAllProdukten();
                    break;
                case 5:
                    addPatient();
                    break;
                case 6:
                    updatePatient();
                    break;
                case 7:
                    deletePatient();
                    break;
                case 8:
                    listAllPatienten();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProdukt() {
        System.out.print("Enter Produkt name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Produkt price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Produkt herkunftsregion: ");
        String herkunftsregion = scanner.nextLine();
        controller.addProdukt(name, price, herkunftsregion);
    }

    private void updateProdukt() {
        System.out.print("Enter Produkt name to update: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Produkt price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Produkt herkunftsregion: ");
        String herkunftsregion = scanner.nextLine();
        controller.updateProdukt(name, price, herkunftsregion);
    }

    private void deleteProdukt() {
        System.out.print("Enter Produkt name to delete: ");
        String name = scanner.nextLine();
        controller.deleteMedikament(name);
    }

    private void listAllProdukten() {
        List<Produkten> produkten = controller.getAllProdukten();
        produkten.forEach(System.out::println);
    }

    private void addPatient() {
        System.out.print("Enter Patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient herkunftsdorf: ");
        String herkunftsdorf = scanner.nextLine();
        controller.addPatient(name, herkunftsdorf);
    }

    private void updatePatient() {
        System.out.print("Enter Patient ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Patient herkunftsdorf: ");
        String herkunftsdorf = scanner.nextLine();
        controller.updatePatient(id, name, herkunftsdorf);
    }

    private void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        controller.deletePatient(id);
    }

    private void listAllPatienten() {
        List<Charakteren> patienten = controller.getAllPatients();
        patienten.forEach(System.out::println);
    }

}