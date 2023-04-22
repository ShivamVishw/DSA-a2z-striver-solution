public class Pattern17 {
    
    public static void main(String[] args) {
        int n=4;
        for(int row=1; row<=n; row++){
            int alphabet=64;
           
            int space= n-row;
            for(int s=1; s<=space; s++){

                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print((char)(alphabet+col));
            }
            for(int col=row-1; col>=1; col--){
                System.out.print((char)(alphabet+col));
            }
            System.out.println();
        }
    }
}

// Input 
// 4

// Output
//    A
//   ABA
//  ABCBA
// ABCDCBA