package Controllers;

import connection.MyJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class statistiqueControllers {
    Connection connection = MyJDBC.getConnection();
public void NumbreLivrePerdu(){
    try{
    PreparedStatement preparedStatement= connection.prepareStatement("SELECT COUNT(*) FROM `reservation` WHERE statusLivre=\"perdu\"");
   ResultSet resultSet= preparedStatement.executeQuery();
      resultSet.next();
      int count= resultSet.getInt(1);
        System.out.println("numbre de livre perdu : "+ count);
    }

    catch (Exception e){
        e.printStackTrace();
    }
}
}
