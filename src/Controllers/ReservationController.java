package Controllers;

import connection.MyJDBC;
import enums.StatusLivre;
import modules.Resarvation;

import java.sql.*;

public class ReservationController {
    Connection connection = MyJDBC.getConnection();
    Resarvation resarvation =new Resarvation();
    public void index (){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from reservation");
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                Date dateDemprunt=resultSet.getDate("dateDemprunt");
                Date datePrevueDeRetoure=resultSet.getDate("datePrevueDeRetoure");
                Date dateDeRetoure=resultSet.getDate("dateDeRetoure");
                int adherentID=resultSet.getInt("adherentID");
                int livreID=resultSet.getInt("livreID");
                String statusLivre=resultSet.getString("statusLivre");
                System.out.println("dateID :"+ id);
                System.out.println("dateDemprunt :"+dateDemprunt);
                System.out.println("datePrevueDeRetoure :"+datePrevueDeRetoure);
                System.out.println("dateDeRetoure :"+dateDeRetoure);
                System.out.println("livreID :"+adherentID);
                System.out.println("statusLivre :"+livreID);
                System.out.println("statusLivre :"+statusLivre);
                System.out.println("--------------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void store(Resarvation resarvation){
        try{
         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `reservation`( `datePrevueDeRetoure`, `adherentID`, `livreID`) VALUES (?,?,?)");
         Date pushDate= new Date( resarvation.getDatePrevueDeRetoure().getTime());
         preparedStatement.setDate(1,pushDate);
         preparedStatement.setInt(2,resarvation.getAdherentID());
         preparedStatement.setInt(3,resarvation.getLivreID());
         preparedStatement.executeUpdate();
    }catch (Exception e){
        e.printStackTrace();
        }
    }
     public void updateReservation(Resarvation resarvation) {

                try {
                 PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `reservation` SET `dateDeRetoure`=?,`statusLivre`=? where id =?");
                 StatusLivre statusLivre= resarvation.getStatusLivre();
                    Date dateReteur = resarvation.getDateDeRetoure()==null ? null :  new Date(resarvation.getDateDeRetoure().getTime());
                 preparedStatement.setDate(1,dateReteur);
                 preparedStatement.setString(2, statusLivre.status);
                 preparedStatement.setInt(3,resarvation.getId());
                 preparedStatement.executeUpdate();
             }catch(Exception e){
                e.printStackTrace();
            }
    }

}
