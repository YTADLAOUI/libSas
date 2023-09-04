package modules;

public class Livre {
    public Livre() {
    }
    private int isbn;
    private string titre;
    private string quantiteTotal;
    private  string quantitePerdu;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public string getTitre() {
        return titre;
    }

    public void setTitre(string titre) {
        this.titre = titre;
    }
}

