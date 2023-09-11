package modules;


import java.util.ArrayList;
import java.util.List;

public class Author {
    public Author(){
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nom;
//    private List<Livre> Livres = new ArrayList<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Author(String nom) {
        this.nom = nom;
    }

//    public List<Livre> getLivres() {
//        return Livres;
//    }

//    public void setLivres(List<Livre> livres) {
//        Livres = livres;
//    }

    @Override
    public String toString() {
        return "Author{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
