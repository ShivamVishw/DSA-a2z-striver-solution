public class Pattern16 {
    
    public static void main(String[] args) {
        triangleC(5);
    }

    static void triangleC(int n){
        int alphabet= 65;
        for(int row=1; row<=n; row++){
            
            for(int col=0; col<row; col++){
                System.out.print((char)(alphabet)+" ");                
            }alphabet++;
            System.out.println();
        }      
    }
}

// Input 
// 5

// Output
// A 
// B B 
// C C C 
// D D D D 
// E E E E E 