public class Pattern14 {
    
    public static void main(String[] args) {
        triangleC(5);
    }

    static void triangleC(int n){
        int alphabet= 65;
        for(int row=0; row<=n; row++){
            
            for(int col=0; col<row; col++){
                System.out.print((char)(alphabet+col)+" ");                
            }
            System.out.println();
        }
        
    }

}

// Input 
// 5

// Output 
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 