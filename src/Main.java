import Controllers.AuthorController;
import Controllers.LivreController;
import enums.StatusLivre;
import modules.Adherent;
import modules.Author;
import modules.Livre;
import modules.Resarvation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        LivreController livreController= new LivreController();
        AuthorController authorControlle = new AuthorController();
        Livre livre = new Livre();
        Author author =new Author();
        int choice;
        Scanner input = new Scanner(System.in);
        do {


            showMenu();


            while (!input.hasNextInt()) {
                System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 1.");
                input.next();
            }

            choice = input.nextInt();
            switch (choice) {

                // Case
                case 0:
                    break;
                case 1:
                    livreController.index();
                    break;
                case 2:
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
                    break;
                case 3:
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
                    break;
                case 4:
                    do{
                    System.out.println("Delete un livre entre isbn:");
                        livre.setIsbn(input.nextInt());
                        livreController.deleteLivre(livre);
                    }
                    while (!livreController.checkIsbn(livre.getIsbn()));

                    break;
                case 5:
                    System.out.println("Recherche des livres par titre:");
                    do {
                        livre.setTitre(input.nextLine()) ;
                    } while (!livre.getTitre().matches("\\S+"));

                    livreController.rechercherParTitre(livre.getTitre());
                    break;
                    case 6:
                        System.out.println("Afficher tout les authors ");
                        authorControlle.index();
                    break;
                    case 7:
                        System.out.println("insert un author");
                        do {
                            author.setNom(input.nextLine());
                        } while (!author.getNom().matches("\\S+"));
                        authorControlle.store(author);
                    break;
                case 8:

                    do{
                        System.out.println("Delete un author entre id:");
                        author.setId(input.nextInt());
                    }
                    while (authorControlle.checkId(author));
                    authorControlle.delete(author);
                    break;

                default:
                    System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 1");
            }
        }while (choice != 0);
    }

    public static void showMenu(){
        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 pour afficher touts les livres.");
        System.out.println("Press 2 pour insert un livre.");
        System.out.println("Press 3 Update livre");
        System.out.println("Press 4 Delete livre");
        System.out.println("Press 5 recherch livre");
        System.out.println("Press 6 Afficher tout les authores");
        System.out.println("Press 7 insert un author");
        System.out.println("Press 8 delete un author");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }




    }

