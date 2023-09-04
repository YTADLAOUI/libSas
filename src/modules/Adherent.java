package modules;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    public Adherent() {
    }
    private String nom;
    private int numero;
    private List<Resarvation> Resarvations = new ArrayList<>();

    public Adherent(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                ", Resarvations=" + Resarvations +
                '}';
    }
}
