import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char [][]board = new char[3][3];

        //intitally set blank for all places
        for(int row= 0; row<board.length; row++){
            for(int col =0; col<board[row].length;col++){
                board[row][col] = ' ';
            }
        }

        //intitalizing player with x
        char player = 'x';
        // intitally game is not over
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            
            printBoard(board);

            System.out.println("Player "+player+ " enter:");

            int row= sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col]==' '){
                board[row][col] = player;

                gameOver= haveWon(board, player);

                if(gameOver){
                    System.out.println("Congratulations player "+player+" you won the game");
                }else{
                    //switching the player if no one won the game 
                    if(player=='x'){
                        player='o';
                    }else{
                        player ='x';
                    }
                }
            }else{
                System.out.println("Invaild move");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][]board, char player){
        for(int row=0; row<board.length; row++){
            //row
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
            //col
            if(board[0][row]==player && board[1][row]==player && board[2][row]==player){
                return true;
            }
            // 1st digonal
            if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }
            //2nd digonal
            if(board[2][0]==player && board[1][1]==player && board[0][2]==player){
                return true;
            } 
        }
        return false;
    }

    public static void printBoard(char[][]board){
        for(int row= 0; row<board.length; row++){
            for(int col =0; col<board[row].length;col++){
                System.out.print(board[row][col]+"|");
            }
            System.out.println();
        }
    }
}
