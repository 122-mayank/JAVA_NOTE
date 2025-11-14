
import java.util.Scanner;

public class NQueen {

    public static boolean isSafe(int arr[][], int row, int col, int size) {
        // Check left side of row
        for (int y = 0; y < col; y++) {
            if (arr[row][y] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int x = row - 1, y = col - 1; x >= 0 && y >= 0; x--, y--) {
            if (arr[x][y] == 1)
                return false;
        }

        // Check lower-left diagonal
        for (int x = row + 1, y = col - 1; x < size && y >= 0; x++, y--) {
            if (arr[x][y] == 1)
                return false;
        }

        return true;
    }

    static void solve(int arr[][], int col, int size) {
        if (col == size) {
            // Print one valid configuration
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int row = 0; row < size; row++) {
            if (isSafe(arr, row, col, size)) {
                arr[row][col] = 1;
                solve(arr, col + 1, size);
                arr[row][col] = 0; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of chessboard: ");
        int size = sc.nextInt();

        int arr[][] = new int[size][size];
        solve(arr, 0, size);
    }
}
