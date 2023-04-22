public class Pattern22 {
    public static void main(String[] args) {
        different(2);
    }
    static void different(int n){
        n=2*n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n; col++){
                int printOnWhichIndex= Math.max(Math.max(row, col), Math.max(n-row, n-col));
                System.out.print(printOnWhichIndex+" ");
            }System.out.println();
        }
    }
}

// Input 
// 4

// Output
// 4 4 4 4 4 
// 4 3 3 3 4 
// 4 3 2 3 4 
// 4 3 3 3 4 
// 4 4 4 4 4