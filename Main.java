import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test code here
    int[][] testDiagnol = { {8, 7, 5, 8},
                            {1, 3, 9, 5},
                            {3, 4, 6, 2}
                            };
    System.out.println(sumOfDiag(testDiagnol));
                          
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    int start = 0;
    int lastNum = Integer.MAX_VALUE;
    for(int row = 0; row < matrix.length; row++) {
      for(int col = 0; col < matrix[row].length; col++) {
        if(lastNum != matrix[row][start]) {
          //System.out.println(matrix[row][start]);
          sum += matrix[row][start];
          lastNum = matrix[row][start];
        }
      }
      start++;
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    return null;
  }
}
