public class checkSorted {
    // Check if the array is sorted
    static void sorted(int arr[], int n){
        int temp =0;
        for(int i=0; i<n-1; i++){    
            if(arr[i]>arr[i+1]){
                temp++;
            }
        }
        // now check
        if(temp==0){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
    public static void main(String[] args) {
        int arr[] ={13,42,53,62,499};
        int n=arr.length;
        sorted(arr, n);
    }
}
