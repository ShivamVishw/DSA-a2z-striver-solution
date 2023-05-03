public class searchInRotatedSorted {
    static int searchSRotatedSorted(int arr[], int target){
        int start = 0; 
        int end = arr.length-1;
        // we have taken start and end as first and last fpr comparison becoz start and end can be changed
        int first = 0;
        int last = arr.length-1;

        while(start<=end){
            int mid = start +(end -start)/2;

            if(target< arr[mid] && target < arr[first]){
                start = mid+1;
            }else if(target < arr[mid] && target > arr[last]){
                end = mid-1;
            }else if(target>arr[mid] && target<arr[first]){
                start = mid+1;
            }else if(target> arr[mid]){
                start = mid+1;
            }else{
                return mid;
            
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2,3};
        int target = 5;
        System.out.println(searchSRotatedSorted(arr, target));        
    }
    // This program is exception for 0 integer 
}
