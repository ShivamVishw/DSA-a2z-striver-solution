public class peakElement {
    // Find the peak element in the array.
    static int search(int arr[]){        
       int start = 0;
       int end = arr.length-1;

        while(start<=end){
           // find the middle element
           // int mid = (start + end) / 2; // might be possible that,
           // (start + end) exceeds the range of int in java
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
               return mid;
            }else if(arr[mid]>arr[mid-1]){
              start = mid +1;
            }else{
              end= mid -1;
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2};
        System.out.print(search(arr));
        System.out.println();

    }
}
