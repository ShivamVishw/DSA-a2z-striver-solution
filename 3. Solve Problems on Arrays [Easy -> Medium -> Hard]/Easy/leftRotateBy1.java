public class leftRotateBy1 {
    static void leftRotate(int arr[], int n){
        int temp[] = new int[n];
        for(int i=1; i<n; i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]= arr[0];
        
        System.out.println("After rotated");
        for(int i=0; i<n;i++){
            System.out.print(temp[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n= arr.length;

        System.out.println("Before rotated to the left");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        leftRotate(arr, n);
    }   
}
