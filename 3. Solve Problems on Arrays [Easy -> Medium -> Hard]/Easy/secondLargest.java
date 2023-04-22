class secondLargest {
    // first do sorting and then get second largest by writing some conditions
    static void secLargest(int arr[], int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    //do swaping 
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        
        // now sorted 
        int largest= arr[0];
        int seLargest= 0;
        //we are checking for duplication because there may be second largest and largest contain same element 
        for(int i=n-2; i>=0; i--){
            if(arr[i]!=largest){
                seLargest= arr[i];
                break;
            }
        }System.out.println("Second largest element is "+seLargest);
    }
    public static void main(String[] args) {
        int arr[]={34,24,5,32,1};
        int n=arr.length;
        secLargest(arr, n);    
    }
}
