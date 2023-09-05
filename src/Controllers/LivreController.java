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
    public List<Livre> index(){
        List<Livre> livres = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from livre JOIN author ON livre.authorID = author.id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int isbn = resultSet.getInt("isbn");
                String titre = resultSet.getString("titre");
                int quantiteTotal = resultSet.getInt("quantiteTotal");
                int quantitePerdu = resultSet.getInt("quantitePerdu");
                int authorID = resultSet.getInt("authorID");

                Livre livre= new Livre(isbn,titre,quantiteTotal,quantitePerdu,authorID);

                livres.add(livre);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
           return livres;
    }

//    public String store(){}
//    public String;
}
