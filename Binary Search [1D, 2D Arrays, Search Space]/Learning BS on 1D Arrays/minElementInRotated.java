public class minElementInRotated {
    static int minRotated(int arr[]){
        int start = 0;
        int end = arr.length-1;
        // int first = 0;
        // int last = arr[arr.length-1];
        int ans =0;
    
        while(start<=end){
            if(arr.length==2){
                ans = Math.min(start, end);
                return ans;
            }else{
                //find the middle element
                // int mid = (start + end) / 2; // because might be possible that, 
                // (start + end) exceeds the range of int in java
                int mid = start +(end-start)/2;
            
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid+1];

                }else if(arr[mid]>arr[mid-1]){
                    start = mid +1;
                }else{
                    end= mid -1;
                }           
            }
            
        }return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        System.out.println("Minimum element in the rotated sorted array is "+minRotated(arr));
    }
}
