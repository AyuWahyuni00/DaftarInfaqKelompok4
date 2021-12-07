/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package until;

/**
 *
 * @author dell
 */

import java.sql.*;
import javax.swing.JOptionPane;

 public class koneksi {
  private static Connection databasekoneksi;
  public static Connection koneksiDB() {
      if (databasekoneksi == null){
          try {
              String DB = "jdbc:mysql://localhost:3306/infak";
              String user = "root";
              String pass = "";
              
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
              databasekoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
   
          } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "koneksi GAGAL");
          }
      
      } return  databasekoneksi;

  }
}
