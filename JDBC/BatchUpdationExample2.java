import java.util.*;
import java.sql.*;

public class BatchUpdationExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "@12madhav";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url , username , password);
            con.setAutoCommit(false);

            String q = "Insert into employee values(? ,? , ? )";
            PreparedStatement pst = con.prepareStatement(q);

            System.out.println("How many employee you want to insert ? ");
            int n = sc.nextInt();

            for(int i = 0 ; i < n ; i++){

                 System.out.println("Enter the name of Employee: ");
                 String name = sc.next();

                 System.out.println("Enter the salary: ");
                 int salary = sc.nextInt();

                 System.out.println("Enter the age: ");
                 int age = sc.nextInt();

                 pst.setString(1, name);
                 pst.setInt(2 , salary);
                 pst.setInt(3 , age);

                 pst.addBatch();
            }

            int[] results = pst.executeBatch();

            int successCount = 0;

            for(int res : results){
                  if(res > 0){
                    successCount++;
                  }
            }

            if(successCount == n){
                 con.commit();
                 System.out.println(successCount + " records inserted sucessfully !! ");
            }
            else{
                con.rollback();
                System.out.println("Some records failed . Transaction rolled back !!");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}
