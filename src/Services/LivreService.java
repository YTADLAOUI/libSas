package Services;
import Controllers.LivreController;
import modules.Livre;
import java.util.Scanner;


public class LivreService {
    Scanner input = new Scanner(System.in);
    LivreController livreController= new LivreController();
    Livre livre = new Livre();

    public void affichageDuLivre(){
        livreController.index();
    }
    public void storeLivre(){

        do {
            System.out.print("Enter Unique Isbn: ");
            livre.setIsbn(input.nextInt());

        }while (livreController.checkIsbn(livre.getIsbn()));
        System.out.print("Enter titre: ");
        do {
            livre.setTitre(input.nextLine()) ;

        } while (!livre.getTitre().matches("\\S+"));
        System.out.print("Enter quantiteTotal:");

        while (!input.hasNextInt()) {
            System.out.print("Enter quantiteTotal: ");
            input.nextInt();
        }
        livre.setQuantiteTotal(input.nextInt()) ;
        input.nextLine();

        System.out.print("Enter authorID: ");
        while (!input.hasNextInt()) {
            System.out.print("Enter authorID: ");
            input.next();
        }
        livre.setAuthorId(input.nextInt());
        input.nextLine();
        livreController.store(livre);
    }
public void updateLivre(){
    do{
        System.out.print("Entre Unique Isbn: ");
        livre.setIsbn(input.nextInt());
    }while(!livreController.checkIsbn(livre.getIsbn()));
    System.out.print("modifer titre: ");
    do {
        livre.setTitre(input.nextLine()) ;
    } while (!livre.getTitre().matches("\\S+"));
    System.out.print("modifier quantiteTotal: ");
    while (!input.hasNextInt()) {
        System.out.print("modifier quantiteTotal: ");
        input.nextInt();
    }
    livre.setQuantiteTotal(input.nextInt()) ;
    System.out.print("modfier authorID: ");
    while (!input.hasNextInt()) {
        System.out.print("modifier authorID: ");
        input.next();
    }
    livre.setAuthorId(input.nextInt());
    input.nextLine();
    livreController.updateLivre(livre);
}
public void deleteLivre(){
    do{
        System.out.println("Delete un livre entre isbn:");
        livre.setIsbn(input.nextInt());
        livreController.deleteLivre(livre);
    }
    while (!livreController.checkIsbn(livre.getIsbn()));
}
public void rechercheLivre(){
        System.out.println("Recherche des livres par titre:");
        do {
            livre.setTitre(input.nextLine()) ;
        } while (!livre.getTitre().matches("\\S+"));

        livreController.rechercherParTitre(livre.getTitre());
    }
}
