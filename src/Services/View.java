package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Delayed;


public class View {

    Scanner input = new Scanner(System.in);
    int choice;
    LivreService livreService = new LivreService();
    AuthorService authorService = new AuthorService();
    ReservationService reservationService = new ReservationService();
    StatistiqueService statistiqueService = new StatistiqueService();

    public void AffichageView() throws ParseException {

        do {
            showMenu();

            while (!input.hasNextInt()) {
                System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 4.");
                input.next();
            }

            choice = input.nextInt();
            switch (choice) {

                // Case
                case 0:
                    break;
                case 1:
                this.affichageLivre();
                    break;
                case 2:
                this.affichageAuhtor();
                    break;
                case 3:
                this.affichageReservation();
                    break;
                case 4:
               this.affichageStatistique();
                    break;
                case 5:

                    break;


                default:
                    System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 4");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("livre menu");
        System.out.println("Press 2 author menu");
        System.out.println("Press 3 reservation menu");
        System.out.println("Press 4 statistique menu");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }

    public void affichageLivre() throws ParseException {
        do {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 pour afficher touts les livres.");
        System.out.println("Press 2 pour insert un livre.");
        System.out.println("Press 3 Update le livre");
        System.out.println("Press 4 Delete le livre");
        System.out.println("Press 5 Recherche sur livre");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
        while (!input.hasNextInt()) {
            System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 4.");
            input.next();
        }
            choice = input.nextInt();
            switch (choice) {

                case 0:
                        this.AffichageView();
                    break;
                case 1:
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
                default:
                    System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 4");
            }
        } while (choice != 0);
    }

    public void affichageAuhtor() throws ParseException {
        do {
            System.out.println( "----------------------------------------------------------------------------------------------------------");
            System.out.println("Press 1 pour afficher touts les authors.");
            System.out.println("Press 2 pour insert un author.");
            System.out.println("Press 3 Delete author");
            System.out.println("Press 0 to Exit Application.");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------");
        while (!input.hasNextInt()) {
            System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 3.");
            input.next();
        }
            choice = input.nextInt();
            switch (choice) {

                case 0:
                    this.AffichageView();
                    break;
                case 1:
                    authorService.afficherAuthor();
                    break;
                case 2:
                    authorService.storeAuthor();
                    break;
                case 3:
                    authorService.deleteAuthor();
                    break;

                default:
                    System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 3");
            }
        } while (choice != 0);
    }

    public void affichageReservation() throws ParseException {
        do {
            System.out.println( "----------------------------------------------------------------------------------------------------------");
            System.out.println("Press 1 pour afficher touts les reservations.");
            System.out.println("Press 2 pour insert une reservations.");
            System.out.println("Press 3 Update une reservation");
            System.out.println("Press 0 to Exit Application.");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------");
        while (!input.hasNextInt()) {
            System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 3.");
            input.next();
        }
            choice = input.nextInt();
            switch (choice) {

                case 0:
                    this.AffichageView();
                    break;
                case 1:
                    reservationService.afficherReservation();
                    break;
                case 2:
                    reservationService.StoreReservation();
                    break;
                case 3:
                    reservationService.updateReservation();
                    break;

                default:
                    System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 3");
            }
        } while (choice != 0);
    }
        public void  affichageStatistique() throws ParseException {
            do {
                System.out.println( "----------------------------------------------------------------------------------------------------------");
                System.out.println("Press 1 pour afficher statistiquePedu");
                System.out.println("Press 2 pour afficher  statistiqueEmprunte.");
                System.out.println("Press 0 to Exit Application.");
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------");
            while (!input.hasNextInt()) {
                System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 2.");
                input.next();
            }
                choice = input.nextInt();
                switch (choice) {

                    case 0:
                        this.AffichageView();
                        break;
                    case 1:
                        statistiqueService.afficherCountPerdu();
                        break;
                    case 2:
                        statistiqueService.afficherCountEmprunte();
                        break;

                    default:
                        System.out.println("ENTER A VALID CHOIE ENTRE 0 AND 2");
                }
            } while (choice != 0);
        }
    }

