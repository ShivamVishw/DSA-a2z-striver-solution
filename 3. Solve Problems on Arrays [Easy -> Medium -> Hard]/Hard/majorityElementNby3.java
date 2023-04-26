public class majorityElementNby3 {
    // Print majority element greter than N/3
    
    static int majorityElement(int arr[], int n){
        int count=0; 
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>n/3){
                return arr[i];
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,2,1,3};
        itn n = arr.length;
        System.out.println(majorityElement(arr, n));
    }
}
