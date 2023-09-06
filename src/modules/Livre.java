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
        do {
            System.out.print("Enter Unique Isbn: ");
            this.isbn = Integer.parseInt(scanner.nextLine());
        }while (livreController.checkIsbn(this.isbn));

        do {
            System.out.print("Enter titre: ");
            this.titre = scanner.nextLine();
        } while (!titre.matches("\\S+"));
        System.out.print("Enter quantiteTotal:");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter quantiteTotal: ");
                scanner.nextInt();
        }
        this.quantiteTotal = scanner.nextInt();
        scanner.nextLine();
        /*System.out.print("Enter quantitePerdu: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter quantitePerdu: ");
            scanner.next();
        }
        this.quantitePerdu = scanner.nextInt();
        scanner.nextLine();*/

        System.out.print("Enter authorID: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter authorID: ");
            scanner.next();
        }
        this.authorId = scanner.nextInt();
          scanner.nextLine();
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

