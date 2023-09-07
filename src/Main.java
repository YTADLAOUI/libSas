import Controllers.LivreController;
import enums.StatusLivre;
import modules.Adherent;
import modules.Author;
import modules.Livre;
import modules.Resarvation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LivreController livreController= new LivreController();
        Livre livre = new Livre();
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

                    do {
                        System.out.print("Enter titre: ");
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

                    break;
                case 4:

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
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }




    }

