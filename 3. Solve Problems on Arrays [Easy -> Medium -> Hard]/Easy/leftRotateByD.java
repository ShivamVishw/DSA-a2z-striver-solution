public class leftRotateByD {
    // 	Left rotate an array by D places
    public static void leftRotate(int arr[],int n, int d){
        //base case
        if(n==0 || d%n==0){
            return;
        }
        int temp[]= new int[n];
        //step 1
        for(int i=0; i<d; i++){
            temp[i]= arr[i];
        }

        //step 2
        for(int i=d; i<n;i++){
            arr[i-d]= arr[i];
        }
        //step 3
        for(int i= n-d; i<n; i++){
            arr[i]= temp[i-(n-d)];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int d= 1;

        leftRotate(arr, n, d);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
