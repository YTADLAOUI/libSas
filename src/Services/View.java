package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class View {


    int choice;
    LivreService livreService =new LivreService();
    AuthorService authorService=new AuthorService();
    ReservationService reservationService=new ReservationService();
    Scanner input=new Scanner(System.in);
public void AffichageView() throws ParseException {

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
                System.out.println("youssef");
                livreService.affichageDuLivre();
                break;
            case 2:
                livreService.storeLivre();
                break;
            case 3:
                livreService.updateLivre();
                break;
            case 4:
                livreService.deleteLivre();
                break;
            case 5:
                livreService.rechercheLivre();
                break;
            case 6:
                authorService.afficherAuthor();
                break;
            case 7:
                authorService.storeAuthor();
                break;
            case 8:
                authorService.deleteAuthor();
                break;
            case 9:
                    reservationService.afficherReservation();
                break;
            case 10:
              reservationService.StoreReservation();
                break;
            case 11:
                reservationService.updateReservation();
                break;
            case 12:


                break;
            case 13:


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