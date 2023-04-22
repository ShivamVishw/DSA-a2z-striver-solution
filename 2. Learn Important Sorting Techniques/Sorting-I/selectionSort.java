public class selectionSort {
    // selection sorting
    static void selection_sort(int arr[], int n){

        //now do sorting 
        for(int i=0; i<=n-2; i++){
            int min= i;
            for(int j=i; j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swaping 
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
        }

        System.out.println("After sorting ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }        
        System.out.println();
        
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
        selection_sort(arr, n);
        
    }
}
