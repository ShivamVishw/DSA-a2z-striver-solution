public class removeDuplicates {
    // Remove duplicates from Sorted array
    static int removeDuplicate(int arr[],int n){
        int i=0;
        for(int j=0; j<n; j++){
            if(arr[j]!=arr[i]){
                arr[i+1]= arr[j];
                i++;
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int arr[]= {1,1,3,4,5,5};
        int n= arr.length;
        System.out.println("Before removal of duplicates arr's length "+n);
        System.out.print("After removal of duplicates length becomes ");
        System.out.println(removeDuplicate(arr, n));
        
    }
}
