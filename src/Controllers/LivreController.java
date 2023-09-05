package Controllers;

import connection.MyJDBC;
import modules.Livre;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivreController {
   Connection connection = MyJDBC.getConnection();
    public void index(){


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from livre JOIN author ON livre.authorID = author.id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int isbn = resultSet.getInt("isbn");
                String titre = resultSet.getString("titre");
                int quantiteTotal = resultSet.getInt("quantiteTotal");
                int quantitePerdu = resultSet.getInt("quantitePerdu");
                String authorID = resultSet.getString("nom");
                System.out.println("ISBN: " + isbn);
                System.out.println("Titre: " + titre);
                System.out.println("QuantiteTotal: " + quantiteTotal);
                System.out.println("QuantitePerdu: " + quantitePerdu);
                System.out.println("Author: " + authorID);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

//    public String store(){}
//    public String;
}
