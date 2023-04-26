public class threeSum {
    // 3 Sum : Find triplets that add up to a zero
    static void threeSumPro(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    if((arr[i]+arr[j]+arr[k]) == 0 && i!=j && j!=k && k!=i){
                        System.out.print("[");
                        System.out.print(arr[i]+",");
                        System.out.print(arr[j]+",");
                        System.out.print(arr[k]+",");
                        System.out.println("]");
                    }
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,0};
        int n=arr.length;
        threeSumPro(arr, n);
    }
}
