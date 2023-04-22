public class Pattern20 {
    
    public static void main(String[] args) {
        Butterfly(5);
    }

    static void Butterfly(int n){
        for(int row = 0; row<n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }for(int s = 0; s <= 2*(n-row); s++){
                System.out.print(" ");
            }for(int col = 0; col <= row; col++){
                System.out.print("*");
            }System.out.println();
        }

        for(int row = n; row >= 0; row--){
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }for(int s = 0; s <= 2*(n-row); s++){
                System.out.print(" ");
            }for(int col = 0; col <= row; col++){
                System.out.print("*");
            }System.out.println();
        }           
        
    }    
}

//Input
//5

//Output
// *           *
// **         **
// ***       ***
// ****     ****
// *****   *****
// ****** ******
// *****   *****
// ****     ****
// ***       ***
// **         **
// *           *