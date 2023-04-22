public class fibnacciSeries {
    static void fibnacci(int a,int b,int n){
        // base case
    if(n==0){
        return;
    }
    int c =a+b;
    System.out.println(c);
    fibnacci(b, c, n-1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        fibnacci(a,b,5);
    }
}
