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
        LivreController livre= new LivreController();
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
                    livre.index();
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
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }




    }

