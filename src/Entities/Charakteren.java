package Entities;

import java.util.ArrayList;
import java.util.List;

public class Charakteren {
    private int id;
    private String name;
    private String herkunftdorf;
    private List<Produkten> gekaufterProdukten;

    public Charakteren(int id, String name, String herkunftdorf) {
        this.id = id;
        this.name = name;
        this.herkunftdorf = herkunftdorf;
        this.gekaufterProdukten = new ArrayList<>();
    }

    public Charakteren(int id, String name, String herkunftdorf, List<Produkten> gekaufterProdukten) {
        this.id = id;
        this.name = name;
        this.herkunftdorf = herkunftdorf;
        this.gekaufterProdukten = gekaufterProdukten;
    }

    public Charakteren() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftdorf() {
        return herkunftdorf;
    }

    public void setHerkunftdorf(String herkunftdorf) {
        this.herkunftdorf = herkunftdorf;
    }

    public List<Produkten> getGekaufterProdukten() {
        return gekaufterProdukten;
    }

    public void setGekaufterProdukten(List<Produkten> gekaufterProdukten) {
        this.gekaufterProdukten = gekaufterProdukten;
    }
}
