package modules;


import java.util.ArrayList;
import java.util.List;

public class Author {
    public Author(){
    }
    private String nom;
    private List<Livre> Livres = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Author(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nom='" + nom + '\'' +
                ", Livres=" + Livres +
                '}';
    }
}
