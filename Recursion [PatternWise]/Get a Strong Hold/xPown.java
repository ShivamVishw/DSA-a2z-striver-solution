class xPown{

    static int xpown(int x, int n){
        //base case
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int xpownm1= xpown(x, n-1);  // x to the power of n-1

        int ValueOfxpown = x* xpownm1;

        return ValueOfxpown;
    }
    public static void main(String[] args) {
        System.out.println(xpown(4, 2));
    }
}