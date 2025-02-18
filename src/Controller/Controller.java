package Controller;

import Entities.Produkten;
import Entities.Charakteren;
import Repository.IRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

/**
 * Unified controller for managing both Produkten and Charakteren.
 */
public class Controller {
    private final IRepository<Produkten> produkteRepo;
    private final IRepository<Charakteren> charackterenRepo;

    public Controller(IRepository<Produkten> produkteRepo, IRepository<Charakteren> charackterenRepo) {
        this.produkteRepo = produkteRepo;
        this.charackterenRepo = charackterenRepo;
    }

    public void addProdukt(String name, double price, String herkunftsregion) {
        Produkten produkt = new Produkten(name, price, herkunftsregion);
        produkteRepo.create(produkt);
    }

    public void updateProdukt(String name, double price, String herkunftsregion) {
        Produkten produkt = new Produkten(name, price, herkunftsregion);
        produkteRepo.updateByName(name, produkt);
    }

    public void deleteMedikament(String name) {
        produkteRepo.deleteByName(name);
    }

    public List<Produkten> getAllProdukten() {
        return produkteRepo.getAll();
    }

    public void addPatient(String name, String herkunftsdorf) {
        Charakteren charackter = new Charakteren(name, herkunftsdorf);
        charackterenRepo.create(charackter);
    }


    public void updatePatient(int id, String name, String herkunftsdorf) {
        Charakteren charackter = new Charakteren(name, herkunftsdorf);
        charackter.setId(id);
        charackterenRepo.update(id, charackter);
    }

    public void deletePatient(int id) {
        charackterenRepo.delete(id);
    }


    public List<Charakteren> getAllPatients() {
        return charackterenRepo.getAll();
    }

}