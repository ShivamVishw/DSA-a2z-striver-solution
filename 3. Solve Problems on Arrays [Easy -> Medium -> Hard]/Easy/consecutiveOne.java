public class consecutiveOne {
    static int maximumConsec(int arr[], int n) {
        int count=0;
        int max=0;
        for(int i= 0; i<n; i++){
            if(arr[i]==1){
                count++;
                max= Math.max(max, count);
            }else{
                count=0;
            }
        }
        
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {1, 0,1,1,1,0,1,1};
        int n= arr.length;
        System.out.println(maximumConsec(arr, n));
    }
}
