public class firstLastOccurence {
    // Find First and Last Position of Element in Sorted Array
    static int search(int arr[], int target, boolean findStartIndex){        
        int start = 0;
        int end = arr.length-1;
        int ans = 0;

        while(start<=end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that,
            // (start + end) exceeds the range of int in java
            int mid = start +(end-start)/2;

            if(target< arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                // found element
                ans = mid;
                //now check whether we want to go on left array or right array 
                // Or you can say whether we want to find first or last occurence  
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,4,5,4,2};
        int target = 4;
        System.out.print("["+search(arr, target, true)+",");
        System.out.println(search(arr, target, false)+"]");
    }

}
