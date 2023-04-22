public class bubbleSort {
    // bubble sortiing
    
    static void bubble_sort(int arr[], int n){
        for(int i=n-1; i>=0;i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    //do swapping
                    int temp= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;

                }
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

        //now call bubble_sort
        bubble_sort(arr, n);
        
    }
}
