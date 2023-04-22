public class Pattern10 {
    
    public static void main(String[] args) {
        RArrow(5);
    }
    static void RArrow(int n){
        for(int row=0; row<=2*n; row++){

            //if(row>n) then totalNoOfRow will be 2*n-row else totalNoOfRow will be row  
            int totalNoOfRow= row>n ? 2*n-row: row;

            //Now print *
            for(int col=0; col<=totalNoOfRow;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

// Input 
// 5

// Output 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 