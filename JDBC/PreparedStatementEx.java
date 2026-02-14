
import java.sql.*;
import java.util.Scanner;


public class PreparedStatementEx {
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="@12madhav";

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the roll no: ");
       int r = sc.nextInt();

       System.out.println("Enter the name: ");
       String n = sc.next();

       System.out.println("Enter the age: ");
       int a = sc.nextInt();

       try {

          //set the driver class
          Class.forName("com.mysql.cj.jdbc.Driver");

          //setting the connection
          Connection con = DriverManager.getConnection(url,username,password);


          String q = "insert into students values(? , ? , ? )";

          PreparedStatement pst = con.prepareStatement(q);

          pst.setInt(1,r);
          pst.setString(2, n);
          pst.setInt(3, a);


          int k = pst.executeUpdate();

          if(k > 0){
               System.out.println("Record Inserted!");
          }
          else{
            System.out.println("Try Again");
          }


       } catch (Exception e) {

             e.printStackTrace();

       }



    }
}
