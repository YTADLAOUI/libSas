package modules;

import java.util.ArrayList;
import java.util.List;

public class Livre {
    public Livre() {
    }
    private int isbn;
    private String titre;
    private String quantiteTotal;
    private  String quantitePerdu;
    private boolean softDelete;
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

    public String getQuantiteTotal() {
        return quantiteTotal;
    }

    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;

    }

    public String getQuantitePerdu() {
        return quantitePerdu;
    }

    public void setQuantitePerdu(String quantitePerdu) {
        this.quantitePerdu = quantitePerdu;
    }

    public Livre(int isbn, String titre, String quantiteTotal, String quantitePerdu) {
        this.isbn = isbn;
        this.titre = titre;
        this.quantiteTotal = quantiteTotal;
        this.quantitePerdu = quantitePerdu;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", titre='" + titre + '\'' +
                ", quantiteTotal='" + quantiteTotal + '\'' +
                ", quantitePerdu='" + quantitePerdu + '\'' +
                ", Resarvations=" + Resarvations +
                '}';
    }
}

