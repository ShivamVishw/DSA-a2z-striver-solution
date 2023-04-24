public class subarrayWithSumK {
    // Number of subarray with sum k 
    static int subarraySumK(int arr[], int k, int n){
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=0;
            for(int m= i; m<=j; m++){
                sum= sum + arr[m];
            }
            if(sum==k){
                count++;
            }
        }
    }return count;
}
    public static void main(String[] args) {
        int arr[]= {3,1,2,4};
        int k=6;
        int n=arr.length;
        System.out.println(subarraySumK(arr, k, n));
    }
}
