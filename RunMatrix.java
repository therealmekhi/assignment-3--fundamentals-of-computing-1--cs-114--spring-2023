import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the size of the matrix: ");
      int size = scanner.nextInt();

      Matrix matrix = new Matrix(size);

      System.out.println("\nMatrix before populating:");
      matrix.printMatrix();

      matrix.populateMatrix();

      System.out.println("\nMatrix after populating:");
      matrix.printMatrix();

      matrix.flipMatrix();

      System.out.println("\nMatrix after flipping:");
      matrix.printMatrix();
    }
  }
}
