public class KadaneAlgo {
   
    static int maxSubArray(int arr[]){
        int targetMAx= Integer.MIN_VALUE;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
            //now check condition whether targetmax is greter than sum
            if(sum>targetMAx){
                targetMAx = sum;
            }

            //now check if sum  is negetive 
            if(sum<0){
                sum=0;
            }
        }
        return targetMAx;
    }

    public static void main(String[] args) {
        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        
    }
}
