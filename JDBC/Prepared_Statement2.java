import java.sql.DriverManager;
import  java.util.Scanner;
import java.sql.Connection;
import java.sql.*;

public class Prepared_Statement2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "@12madhav";

        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        try {

              Class.forName("com.mysql.cj.jdbc.Driver");

              Connection con = DriverManager.getConnection(url , username , password);

              String q = "insert into employee values(? , ? , ?)";

              PreparedStatement pst =  con.prepareStatement(q);

              pst.setString(1, name);
              pst.setInt(2 , salary);
              pst.setInt(3, age);

              int k = pst.executeUpdate();

              if( k > 0){
                     System.out.println("Record Inserted!!");
              }
              else{
                  System.out.println("Try Again");
              }

               q = "Select * from employee";

               ResultSet rs = pst.executeQuery(q);

               System.out.println("------Printing the Employee Data------");

               while(rs.next()){

                  String name2 = rs.getString("Name");
                  int salary2 = rs.getInt("Salary");
                  int age2 = rs.getInt("Age");

                  System.out.println(name2 + "/" + salary2 + "/"+ age2);
               }
               rs.close();
               con.close();
               System.out.println("Connection Closed Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
