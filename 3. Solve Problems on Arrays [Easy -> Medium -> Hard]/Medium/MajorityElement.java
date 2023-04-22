public class MajorityElement {
    // Find the Majority Element that occurs more than N/2 times
    static int majorityElemenet(int arr[], int n){
    
        int count =0;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }       
            }

            if(count> (n/2)){
                return arr[i];
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr[] ={0,1,1,1,0,2,2,1,0};
        int n= arr.length;
        System.out.println(majorityElemenet(arr, n));
        
    }
}
