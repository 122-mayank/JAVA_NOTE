
import java.util.Scanner;
import java.sql.*;

public class DBConnect1 {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "@12madhav";

      System.out.println("Enter the name of Person: ");
      String name = sc.next();

      System.out.println("Enter the salary of Person: ");
      int salary = sc.nextInt();

      System.out.println("Enter the age of Person: ");
      int age = sc.nextInt();


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection( url , username, password);

            if(con != null){
                 System.out.println("Connection Established!!");
            }

            Statement st = con.createStatement();

            String query = "insert into Employee values('"+name+"' , "+salary+", "+age+")";

            int k = st.executeUpdate(query);

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
