public class sumOfFirstNatural {
    static void printSum(int i, int n, int sum){
        //base case
        if(i==n){
            sum= sum+i;
            System.out.println("The sum of first natural number is "+sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
