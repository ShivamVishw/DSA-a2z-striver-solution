public class Pattern12 {
    
    public static void main(String[] args) {
        pattern(4);

    }
    
    static void pattern(int n){

        for(int row = 1; row<=n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }for(int s = 1; s <= 2*(n-row); s++){
                System.out.print(" ");
            }for(int col = row; col >=1; col--){
                System.out.print(col);
            }System.out.println();
        }
    }
    
}

// Input 
// 4

// Output 
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321