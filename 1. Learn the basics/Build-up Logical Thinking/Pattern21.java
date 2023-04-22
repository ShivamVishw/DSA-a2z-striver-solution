public class Pattern21 {
    
    public static void main(String[] args) {
        square(4);
    }
    static void square(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col==1||col==n||row==1||row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}

// Input 
// 4

// Output
// ****
// *  *
// *  *
// ****