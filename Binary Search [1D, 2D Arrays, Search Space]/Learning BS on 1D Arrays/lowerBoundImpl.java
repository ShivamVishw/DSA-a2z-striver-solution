public class lowerBoundImpl {
    //Binary search -- Lower bound i.e ceiling of a number.
    static int ceiling(int arr[], int target){
        // Remember it should be sorted for binary search 
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            // here we have taken start +(end-start)/2 instead of (start +end)/2 is because range of integer can exceed so for prevent that we have written in different form.
        
            int mid = start +(end-start)/2;
            
            if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }    
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,6,7,12,23,43};
        int target = 7;
        System.out.println(ceiling(arr, target));     
    }        
}
