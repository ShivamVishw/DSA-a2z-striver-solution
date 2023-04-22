public class factorial {
    static int calcFact(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        int facnm1= calcFact(n-1);
        int factn= n*facnm1;
        return factn;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of given number is "+calcFact(5)); 
    }
}
