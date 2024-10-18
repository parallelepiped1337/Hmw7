import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
                
            }
            
        }

        System.out.println("Матриця 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d ", matrix[i][j]);
                
            }
            
            System.out.println();
            
        }

        int sumEvenRows = 0;
        int sumOddRows = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    sumEvenRows += matrix[i][j];
                } else {
                    sumOddRows += matrix[i][j];
                    
                }
                
            }
            
        }

        long productEvenCols = 1;
        long productOddCols = 1;

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) {
                    productEvenCols *= matrix[i][j];
                } else {
                    productOddCols *= matrix[i][j];
                    
                }
                
            }
            
        }

        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + productEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + productOddCols);

        if (isMagicSquare(matrix)) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
            
        }
        
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicSum = 0;

        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
            
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
                
            }
            
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
                
            }
            
            if (colSum != magicSum) {
                return false;
                
            }
            
        }

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n - 1 - i];
            
        }
    
        return diagonalSum1 == magicSum && diagonalSum2 == magicSum;
        
    }
    
}
