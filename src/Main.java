import Controllers.AuthorController;
import Controllers.LivreController;
import Controllers.ReservationController;
import Services.LivreService;
import Services.View;
import enums.StatusLivre;
import modules.Adherent;
import modules.Author;
import modules.Livre;
import modules.Resarvation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static View view =new View();
        public static void main(String[] args) throws ParseException {
            view.AffichageView();
        }
    }