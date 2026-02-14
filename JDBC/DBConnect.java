

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnect{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="@12madhav";

        System.out.println("Enter the rollid ,name , age: ");
        int r = sc.nextInt();
        String s = sc.next();
        int a = sc.nextInt();


        try {

            //load the driver class name
            Class.forName("com.mysql.cj.jdbc.Driver");

            //set the connection
            Connection con = DriverManager.getConnection(url , username  , password);

            if(con != null){
                 System.out.println("Connection established!!");
            }

            Statement stmt = con.createStatement();

            String query = "INSERT INTO students VALUES (" + r + ", '" + s + "', " + a + ")";

           int k = stmt.executeUpdate(query);
           if(k>0){
            System.out.println("Record Inserted!!");
           }
           else{
            System.out.println("Try Again!!");
           }
        } catch (Exception e) {
             e.printStackTrace();
        }



     }

}