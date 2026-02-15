import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. DEMONSTRATING THE TRAP
        System.out.println("--- The Scanner Trap ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // User types 25 and hits ENTER
        
        // The number 25 is taken, but the ENTER (\n) stays in the buffer!
        
        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // This immediately "sees" the leftover ENTER and finishes!
        
        System.out.println("Result -> Age: " + age + ", Name: [" + name + "]");
        System.out.println("(Notice how it didn't let you type the name!)\n");

        // -------------------------------------------------------

        // 2. THE CORRECT WAY (The Fix)
        System.out.println("--- The Correct Way ---");
        System.out.print("Enter your age again: ");
        int ageFix = sc.nextInt();
        
        // FIX: Consume the leftover newline character
        sc.nextLine(); 
        
        System.out.print("Enter your full name again: ");
        String nameFix = sc.nextLine(); // Now it waits for your actual input
        
        System.out.println("Result -> Age: " + ageFix + ", Name: " + nameFix);
        
        sc.close();
    }
}