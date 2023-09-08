package Controllers;
import connection.MyJDBC;
import modules.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorController {
    Connection connection = MyJDBC.getConnection();
       public  void index(){

           try {
               PreparedStatement preparedStatement =connection.prepareStatement("SELECT * from author ");
              ResultSet resultSet= preparedStatement.executeQuery();
              while(resultSet.next()){
                  String name= resultSet.getString("nom");
                  System.out.println("nom de l'author :"+name);
                  System.out.println("--------------------");
              }
           }catch (Exception e){
               e.printStackTrace();
           }

   }
   public void store(Author author)  {
       try {
           PreparedStatement preparedStatement = connection.prepareStatement("insert into  author(nom) values (?)");
           preparedStatement.setString(1,author.getNom());
           preparedStatement.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }
   }


}
