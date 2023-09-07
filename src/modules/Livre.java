package modules;

import Controllers.LivreController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livre {
    Scanner scanner = new Scanner(System.in);
    LivreController livreController=new LivreController();
    private int isbn;
    private String titre;
    private int quantiteTotal;
    private  int quantitePerdu;
    private int authorId;
    private boolean softDelete;

    public Livre() {
    }
    public Livre(int isbn, String titre, int quantiteTotal, int authorId) {
        this.isbn = isbn;
        this.titre = titre;
        this.quantiteTotal = quantiteTotal;
        this.authorId = authorId;

    }
//    private List<Resarvation> Resarvations = new ArrayList<>();
//
//    public List<Resarvation> getResarvations() {
//        return Resarvations;
//    }

   /* public void setResarvations(List<Resarvation> resarvations) {
        Resarvations = resarvations;
    }*/
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean isSoftDelete() {
        return softDelete;
    }

    public void setSoftDelete(boolean softDelete) {
        this.softDelete = softDelete;
    }

    public int getQuantiteTotal() {
        return quantiteTotal;
    }

    public void setQuantiteTotal(int quantiteTotal) {
        this.quantiteTotal = quantiteTotal;

    }

    public int getQuantitePerdu() {
        return quantitePerdu;
    }

    public void setQuantitePerdu(int quantitePerdu) {
        this.quantitePerdu = quantitePerdu;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", titre='" + titre + '\'' +
                ", quantiteTotal='" + quantiteTotal + '\'' +
                ", quantitePerdu='" + quantitePerdu + '\'' +
                ", authorId=" + authorId +
                ", softDelete=" + softDelete +
                '}';
    }
}

