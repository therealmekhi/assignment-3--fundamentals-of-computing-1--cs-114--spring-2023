public class Matrix {

  private int[][] matrix;

  public Matrix(int size) {
      matrix = new int[size][size];
      System.out.println("Matrix created with dimensions " + size + "x" + size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
      int temp = matrix[x1][y1];
      matrix[x1][y1] = matrix[x2][y2];
      matrix[x2][y2] = temp;
  }

  public void printMatrix() {
      for (int row = 0; row < matrix.length; row++) {
          for (int column = 0; column < matrix[0].length; column++) {
              if (row == column) {
                  System.out.print(" \033[43m" + matrix[row] [column] + " \033[0m ");
              } else {
                  System.out.print(matrix[row][column] + " ");
              }
          }
          System.out.println();
      }
  }

  public void populateMatrix() {
      int value = 1;
      for (int row = 0; row < matrix.length; row++) {
          for (int column = 0; column < matrix[0].length; column++) {
              matrix[row][column] = value;
              value++;
          }
      }
  }

  public void flipMatrix() {
    for (int row = 0; row < this.matrix.length; row++) {
        for (int column = row + 1; column < this.matrix[row].length; column++) {
            if (row != column && row + column != this.matrix.length - 1) {
                swap(row, column, column, row);
              }
            }
          }
        }
      }
