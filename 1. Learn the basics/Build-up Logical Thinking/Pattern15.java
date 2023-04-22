public class Pattern15 {
    
    public static void main(String[] args) {
        triangleC(5);
    }
    static void triangleC(int n){
        int alphabet= 65;
        for(int row=n; row>=1; row--){
            for(int col=0; col<row; col++){
                System.out.print((char)(alphabet+col));
            }System.out.println();
        }
        
    }
}

// Input 
// 5

// Output 
// ABCDE
// ABCD
// ABC
// AB
// A