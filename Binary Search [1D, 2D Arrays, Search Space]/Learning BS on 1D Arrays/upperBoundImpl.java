public class upperBoundImpl {
    //Binary search -- Lower bound i.e ceiling of a number.
    static int floor(int arr[], int target){
        // Remember it should be sorted for binary search 
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            // int mid = (start + end) / 2; // might be possible that,
            // (start + end) exceeds the range of int in java
        
            int mid = start +(end-start)/2;
            
            if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }    
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,6,7,12,23,43};
        int target = 13;
        System.out.println(floor(arr, target));     
    }        
}
