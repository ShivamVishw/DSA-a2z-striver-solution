public class largestElement {
    // Largest Element in an Array
    public int largest(int arr[], int n)
    {
        int temp =0;
        for(int i =0; i<n;i++){
            if(arr[i]>temp){
                temp =arr[i];
            }
        }
        return temp;
    }
}
