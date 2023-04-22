public class Pattern11 {
    
    public static void main(String[] args) {
        triangle0(5);
    }
    static void triangle0(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                //condition for 1 and 0
                int sum=row+col;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
}

// Input 
// 5

// Output 
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 