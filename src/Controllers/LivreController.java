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

    public void index() {


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from livre JOIN author ON livre.authorID = author.id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
                System.out.println("----------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void store(Livre livre) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO livre (isbn, titre,quantiteTotal, authorId) VALUES (?,?,?,?)");
            preparedStatement.setInt(1, livre.getIsbn());
            preparedStatement.setString(2, livre.getTitre());
            preparedStatement.setInt(3, livre.getQuantiteTotal());
            preparedStatement.setInt(4, livre.getAuthorId());
            preparedStatement.executeUpdate();
            System.out.println("goood");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to insert le livre dans la baseDonne.");
        }
    }

    public  Boolean checkIsbn(int Isbn) {
            try{ PreparedStatement preparedStatement= connection.prepareStatement("SELECT COUNT(*) FROM lIVRE WHERE isbn=?");
                preparedStatement.setInt(1,Isbn);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                int count = resultSet.getInt(1);

                if (count > 0) {
                    return true;
                } else {
                    return false;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        return false;
    }

}
