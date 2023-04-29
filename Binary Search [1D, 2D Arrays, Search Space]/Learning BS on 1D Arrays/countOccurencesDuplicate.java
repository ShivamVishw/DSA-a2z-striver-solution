public class countOccurencesDuplicate {
    // Count occurrences of a number in a sorted array with duplicates
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
            }else{// found element
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
        int arr[] = {2,3,4,4,4,4,4,5,5,5,5,5,5,5,7};
        int target = 5;
        int firstOccurence = search(arr, target, true) ;
        int lastOccurence = search(arr, target, false) ;
        // Now we have got first and last occurence place so as we know it is sorted, 
        // so we can take difference of last and first occurence 
        // i.e (lastOccurence - forstOccurence+1)
        System.out.println(target + " has occured "+(lastOccurence- firstOccurence + 1)+" times");
    }
}
