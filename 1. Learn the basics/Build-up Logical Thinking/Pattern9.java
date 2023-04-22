public class Pattern9 {
    
    public static void main(String[] args) {
        diamond(5);
    }
    static void diamond(int n){
        for(int row=0; row<=2*n; row++){

            //if(row>n) then totalNoOfRow will be 2*n-row+1 else totalNoOfRow will be row  
            int totalNoOfRow= row>n ? 2*n-row+1: row;

            //Now print spaces
            int spaces=n-totalNoOfRow;
            for(int s=0;s<=spaces; s++){
                System.out.print(" ");
            }
            //Now print *
            for(int col=1; col<=totalNoOfRow;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

// Input 
// 5

// Output 
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 