public class insertPositionOfK {
    // Search right Position for K in the sorted array
    static int RightPositionOfK(int arr[], int K){
        
        int start =0; 
        int end = arr.length-1;

        while(start<=end){

            //find the middle element
            // int mid = (start + end) / 2; // might be possible that, 
            // (start + end) exceeds the range of int in java
            int mid = start +(end-start)/2;

            if(arr[mid]==K){
                return mid;
            }else if(arr[mid]<K){
                start = mid+1;
            }else{
                end = mid-1; // nothing but checking arr[mid] > K
            }
        }
        return end+1;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,6,7,8,9,10};
        int K= 5;
        System.out.println(RightPositionOfK(arr, K));
    }
}
