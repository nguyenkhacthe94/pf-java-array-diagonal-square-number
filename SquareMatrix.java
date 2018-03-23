import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int edge;
        do {
            System.out.print("Enter the square matrix edge: ");
            edge = input.nextInt();
            if (edge < 1 || edge > 10) System.out.println("\n Edge should not exceed 10");
        } while (edge < 1 || edge > 10);
        float matrix[][] = new float[edge][edge];
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                System.out.print("Enter matrix number at " + (i + 1) + ", " + (j + 1) + ": ");
                matrix[i][j] = input.nextFloat();
            }
        }
        float sum = 0;
        for (int i = 0; i < edge; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Total numbers on diagonal line is: " + sum);
    }
}