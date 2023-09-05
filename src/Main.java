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

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("youssef");
    Author author2 = new Author("hicham");
    Author author3 = new Author("anas");
    Livre livre1 = new Livre(1234,"the peerless dad",10,0,1);
    Livre livre2 = new Livre(1235,"the peerless mom",10,0,2);
    Livre livre3 = new Livre(1236,"the peerless bro",10,0,3);
    Livre livre4 = new Livre(1237,"the peerless sis",10,0,3);
        Adherent adherent1= new Adherent("nadir",0600000000);
        Adherent adherent2= new Adherent("adnane",060000001);
        Date currentDate = new Date();
        Date Date1 = new Date(currentDate.getTime() + (7 * 24 * 60 * 60 * 1000));
        Date Date2 = new Date(currentDate.getTime() + (15 * 24 * 60 * 60 * 1000));
        Date Date3 = new Date(currentDate.getTime() + (17 * 24 * 60 * 60 * 1000));
        Resarvation resarvation1 = new Resarvation(currentDate,Date1,null,StatusLivre.Disponible,1,1);
        Resarvation resarvation3 = new Resarvation(currentDate,Date3,null,StatusLivre.Disponible,1,1);
        Resarvation resarvation2 = new Resarvation(currentDate,Date2,null,StatusLivre.Disponible,2,3);

        author1.setLivres(Arrays.asList(livre1,livre2));
        author2.setLivres(Arrays.asList(livre3));
        author3.setLivres(Arrays.asList(livre4));
        livre1.setResarvations(Arrays.asList(resarvation1,resarvation3));
        livre2.setResarvations(Arrays.asList(resarvation2));
         adherent1.setResarvations(Arrays.asList(resarvation1,resarvation2));
         adherent2.setResarvations(Arrays.asList(resarvation3));

       /* System.out.println("livre 1 info:" + livre1.toString());
        System.out.println("livre 2 info:" + livre2.toString());
        System.out.println("livre 3 info:" + livre3.toString());
        System.out.println("livre 4 info:" + livre4.toString());
        System.out.println("Author 1 info: " + author1.toString());
        System.out.println("Author 2 info: " + author2.toString());
        System.out.println("Author 2 info: " + author3.toString());
        System.out.println("adherent 1 info:" + adherent1.toString());
        System.out.println("adherent 2 info:" + adherent2.toString());
        System.out.println("reservation 1 info:" + resarvation1.toString());
        System.out.println("reservation 2 info:" + resarvation2.toString());
        System.out.println("reservation 3 info:" + resarvation3.toString());*/
        LivreController dd = new LivreController();

        dd.index();




    }

}