package Services;

import Controllers.ReservationController;
import modules.Resarvation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationService {
    Resarvation resarvation = new Resarvation();
    ReservationController reservationController =new ReservationController();
    Scanner input= new Scanner(System.in);


    public void afficherReservation(){
        reservationController.index();
    }
    public void StoreReservation(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datePrevueDeRetoure = null;

        System.out.print("Enter DatePrevueDeRetoure (yyyy-MM-dd):");
        do {
            String dateString = input.nextLine();

            try {
                datePrevueDeRetoure = dateFormat.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
                System.out.println("HI");
            }
        } while (datePrevueDeRetoure == null);
        resarvation.setDatePrevueDeRetoure( datePrevueDeRetoure);
        System.out.print("Entre livreID: ");
        while (!input.hasNextInt()) {
            System.out.print("Entre livreID: ");
            input.next();
        }
        resarvation.setLivreID(input.nextInt());
        input.nextLine();
        System.out.print("Entre adherentID: ");
        while (!input.hasNextInt()) {
            System.out.print("Entre adherentID: ");
            input.next();
        }
        resarvation.setAdherentID(input.nextInt());
        input.nextLine();
        reservationController.store(resarvation);
    }
}
