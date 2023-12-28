import java.util.Scanner;


public class nQueens{
    public static void solveQueen(int n ){
        int[] board = new int[n];  //represent columm position of queens
        placequeens(board, 0, n);
    }

    //function to check if queen placing at right positioo
    private static boolean isSafe(int [] board, int row, int col,int n){
        for(int i=0; i<row; i++){
            if(board[i]== col || board[i] -i == col-row || board[i]+i == col+row){
                return false;  //because conditions not satisfied
            } 
        }
        return true;
    }
    
    private static void placequeens(int []board, int row, int n){
        if(row== n){
            //means it has fiinished whole queens successfully
            printBoard(board, n);
            System.out.println();
        }
        else{
            //if nhi finished hua hai 
            for(int col=0; col<n; col++){
                if(isSafe(board, row, col,n)){
                    //place the queen at (row , col)
                    board[row] = col;

                    //call recursivvely for next row 
                    placequeens(board, row+1, n);
                }
            }
        }
    }

    private static void printBoard(int []board, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i] == j){
                    System.out.print(" Q ");
                }else{
                    System.out.print(" . ");
                }
            }System.out.println();
        }
    }


    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        solveQueen(n);
    }
}