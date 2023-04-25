public class missingNumber {
    // 	Find missing number in an array
    public static int misingNumber(int []arr, int N) {

        //outer loop to run fnumber from 1 to N
        for(int i=1; i<N;i++){
            int temp=0;
            //loop for cheacking whether given array follow 1 to N sequentially
            for(int j=0; j<N-1; j++){
                if(arr[j]==i){

                    temp=1;
                    break;
                }
            }
            //Now check if temp =0 i.e arr[j]!==i so that number will be misssing
            if(temp==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int N = 6;
        int a[] = {1, 2,4,5,6};

        int ans = misingNumber(a, N);
        System.out.println("Missing number is -> " + ans);
    }
}
