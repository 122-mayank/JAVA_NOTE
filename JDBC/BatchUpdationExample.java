
import java.sql.*;
import java.util.Scanner;

public class BatchUpdationExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";

        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);
            con.setAutoCommit(false); // Disable auto commit

            // Prepare statement for inserting values
            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            System.out.print("How many students do you want to insert? ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for student " + i + ":");

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                // Set parameters
                pst.setInt(1, roll);
                pst.setString(2, name);
                pst.setInt(3, age);

                // Add to batch
                pst.addBatch();
            }

            // Execute batch
            int[] results = pst.executeBatch();

            int successCount = 0;
            for (int res : results) {
                if (res > 0) successCount++;
            }

            if (successCount == n) {
                con.commit();
                System.out.println("\n✅ " + successCount + " records inserted successfully!");
            } else {
                con.rollback();
                System.out.println("\n⚠️ Some records failed. Transaction rolled back.");
            }

            // Close connection
            pst.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
