package Services;

import Controllers.ReservationController;
import enums.StatusLivre;
import modules.Resarvation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservationService {
    Resarvation resarvation = new Resarvation();
    ReservationController reservationController =new ReservationController();
    Scanner input= new Scanner(System.in);
    private static final String DATE_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

    public static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }


    public void afficherReservation(){
        reservationController.index();
    }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date datePrevueDeRetoure = null;
    public void StoreReservation(){

        System.out.print("Enter DatePrevueDeRetoure (yyyy-MM-dd):");
        do {
            String dateString = input.nextLine();

            try {
                datePrevueDeRetoure = dateFormat.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
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
    public void updateReservation() throws ParseException {
            Date dateDeRetoure=null;
            boolean replay;
            do {
                System.out.println("Entre Date de retour:");
                String dataRetour= input.nextLine();
                if( dataRetour.isEmpty()||isValidDate(dataRetour)) {
                    if (!dataRetour.isEmpty()){dateDeRetoure = dateFormat.parse(dataRetour);};
                    resarvation.setDateDeRetoure(dateDeRetoure);
                    replay=false;
                }else {
                    replay=true;
                }
            }while (replay);
        System.out.println("Entre status de reservation [Disponible,Perdu] ");
        resarvation.setStatusLivre(StatusLivre.valueOf(input.nextLine()));
        System.out.println("Entre id  de livre");
        resarvation.setId(input.nextInt());
        reservationController.updateReservation(resarvation);
    }

}
