public class buySell {
    // Stock Buy And Sell You are given an array of prices where prices[i] is the price of a given stock on an ith day.

    static int buySellStock(int arr[],int n, int buyDate, int sellDate){
        
        System.out.println("Mentioned buying date is : "+buyDate);
        System.out.println("Mentioned selling Date : "+sellDate);

        // Now check is it profitable or not
        int maxProfit=0;
        if(arr[sellDate]>arr[buyDate]){
            maxProfit = arr[sellDate] - arr[buyDate];
            System.out.print("Maximum profit is: ");           
            return maxProfit;
        }else{
            System.out.print("Not profitable i.e profit : ");
            return 0;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,9};
        int n=arr.length;
        int buyDate = 2;
        int sellDate = 5;
        System.out.println(buySellStock(arr, n, buyDate, sellDate));       
    }
}
