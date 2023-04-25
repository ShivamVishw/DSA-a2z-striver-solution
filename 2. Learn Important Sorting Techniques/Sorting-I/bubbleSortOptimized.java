public class bubbleSortOptimized {
    
    // Optimized solution for bubble sort
    static void bubble_sort(int arr[], int n){
        for(int i=n-1; i>=0;i--){
            int didSwap=0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    //do swapping
                    int temp= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        
        System.out.println("After sorted");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n= arr.length;

        //print before sorting 
        System.out.println("Before sorting ");
        for(int i=0;i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //now call selection_sort
        // selection_sort(arr, n);
        bubble_sort(arr, n);
        
        //note didSwap will take care of time complexity
    }
}
