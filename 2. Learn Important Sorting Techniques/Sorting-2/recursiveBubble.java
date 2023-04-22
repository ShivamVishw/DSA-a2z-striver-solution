public class recursiveBubble {
    static void recursivBubble(int arr[], int n){
        // base case
        if(n==1){
            return;
        }

        for(int i=0; i<=n-2; i++){
            //now do swaping
            if(arr[i]> arr[i+1]){
                int temp= arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
            }
        }

        // again call it recursively
        recursivBubble(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[]= {13,9,3,1,34,5,2};
        int n=arr.length;

        //before sorted
        System.out.println("Before sorted");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        //after sorted
        recursivBubble(arr, n);
        System.out.println("After sorted");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
