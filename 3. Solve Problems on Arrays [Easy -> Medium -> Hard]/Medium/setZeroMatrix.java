import java.util.Scanner;
class setZeroMatrix {
    //Set Matrix Zero   
    //Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column,
    // and row to 0 and then return the matrix.   
    static void matrixZero(int matrix[][], int n){    
        if(matrix[1][1]==0){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==1 || j==1){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        //output
        System.out.println("Final matrix is ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
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
        matrixZero(matrix, n);
    }

}
