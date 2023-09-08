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
        public  void delete(Author author){
           try {
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM author where id= ?");
                preparedStatement.setInt(1, author.getId());
                preparedStatement.executeUpdate();
           }catch (Exception e){
               e.printStackTrace();
           }
        }
        public  boolean checkId(Author author){
           try{
               PreparedStatement preparedStatement= connection.prepareStatement("SELECT COUNT(*) from author where id=?");
               preparedStatement.setInt(1,author.getId());
               ResultSet resultSet= preparedStatement.executeQuery();
               resultSet.next();
              int count = resultSet.getInt(1);
              if(count>0){
                  return false;
              }else{
                  return true;
              }
           }catch (Exception e){
               e.printStackTrace();
           }
           return false;
        }

}
