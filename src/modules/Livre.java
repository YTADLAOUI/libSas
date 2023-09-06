package modules;

import java.util.ArrayList;
import java.util.List;

public class Livre {

    private int isbn;
    private String titre;
    private int quantiteTotal;
    private  int quantitePerdu;
    private int authorId;
    private boolean softDelete;
    public Livre() {
    }
    public Livre(int isbn, String titre, int quantiteTotal, int quantitePerdu, int authorId) {
        this.isbn = isbn;
        this.titre = titre;
        this.quantiteTotal = quantiteTotal;
        this.quantitePerdu = quantitePerdu;
        this.authorId = authorId;

    }
    private List<Resarvation> Resarvations = new ArrayList<>();

    public List<Resarvation> getResarvations() {
        return Resarvations;
    }

    public void setResarvations(List<Resarvation> resarvations) {
        Resarvations = resarvations;
    }
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
                ", Resarvations=" + Resarvations +
                '}';
    }
}

