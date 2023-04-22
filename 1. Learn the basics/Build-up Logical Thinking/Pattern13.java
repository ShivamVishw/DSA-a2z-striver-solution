public class Pattern13 {
    
    public static void main(String[] args) {
        traingle(5);
    }

    
    static void traingle(int n){
        int number=1;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(number+" ");
                number++;
            }System.out.println();
        }
    }
}

// Input 
// 5

// Output 
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 