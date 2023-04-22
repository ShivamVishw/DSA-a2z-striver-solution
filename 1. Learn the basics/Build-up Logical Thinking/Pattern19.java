public class Pattern19 {
    
    public static void main(String[] args) {
        Cdiomond(8);
    }

    static void Cdiomond(int n){
        for(int row = n; row >=0; row--){
            for(int col = 0; col<n; col++){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int col = n; col>=0; col--){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int row= 0; row <n+1; row++){
            for(int col = 0; col<n; col++){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int col = n; col>=0; col--){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}


// Input 
// 8

// Output
// *****************
// ******** ********
// *******   *******
// ******     ******
// *****       *****
// ****         ****
// ***           ***
// **             **
// *               *
// *               *
// **             **
// ***           ***
// ****         ****
// *****       *****
// ******     ******
// *******   *******
// ******** ********
// *****************