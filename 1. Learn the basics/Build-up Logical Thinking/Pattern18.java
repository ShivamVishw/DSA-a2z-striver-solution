public class Pattern18 {
    
    public static void main(String[] args) {
        triangleC(4);
    }

    static void triangleC(int n){
        int alphabet= 69;
        for(int row=0; row<=n; row++){
            
            for(int col=0; col<=row; col++){
                System.out.print((char)(alphabet-col)+" ");                
            }
            System.out.println();
        }      
    }
}

// Input 
// 4

// Output
// E 
// E D 
// E D C 
// E D C B 
// E D C B A