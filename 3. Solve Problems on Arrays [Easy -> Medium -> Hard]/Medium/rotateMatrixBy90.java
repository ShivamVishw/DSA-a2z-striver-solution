import java.util.Scanner;
public class rotateMatrixBy90 {
    static void rotateMatrix(int matrix[][],int n){
        int matrix1[][] = new int[n][n];
        for(int row=0; row<n; row++){
            for(int col=0;col<n; col++){
                matrix1[col][n-row-1] = matrix[row][col];

            }
        }
    
        //output
        System.out.println("Rotated matrix is ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix1[i][j]+" ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=3;
        int matrix[][] = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        rotateMatrix(matrix, n);
    }

}
