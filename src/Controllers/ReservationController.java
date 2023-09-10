package Controllers;

import connection.MyJDBC;
import modules.Resarvation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationController {
    Connection connection = MyJDBC.getConnection();
//    Resarvation resarvation =new Resarvation();
    public void index (){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from reservation");
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                Date dateDemprunt=resultSet.getDate("dateDemprunt");
                Date datePrevueDeRetoure=resultSet.getDate("datePrevueDeRetoure");
                Date dateDeRetoure=resultSet.getDate("dateDeRetoure");
                int adherentID=resultSet.getInt("adherentID");
                int livreID=resultSet.getInt("livreID");
                String statusLivre=resultSet.getString("statusLivre");
                System.out.println("dateDemprunt"+dateDemprunt);
                System.out.println("datePrevueDeRetoure"+datePrevueDeRetoure);
                System.out.println("dateDeRetoure"+dateDeRetoure);
                System.out.println("livreID"+adherentID);
                System.out.println("statusLivre"+livreID);
                System.out.println("statusLivre"+statusLivre);
                System.out.println("--------------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void store(Resarvation resarvation){
        try{
         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `reservation`(`dateDemprunt`, `datePrevueDeRetoure`, `adherentID`, `livreID`) VALUES (?,?,?,?)");
         preparedStatement.setDate(1, (Date) resarvation.getDateDemprunt());
         preparedStatement.setDate(2, (Date) resarvation.getDatePrevueDeRetoure());
         preparedStatement.setInt(3,resarvation.getAdherentID());
         preparedStatement.setInt(4,resarvation.getLivreID());
         preparedStatement.executeUpdate();
    }catch (Exception e){
        e.printStackTrace();
        }
    }
    
}
