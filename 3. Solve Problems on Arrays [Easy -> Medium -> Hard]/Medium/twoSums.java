public class twoSums {
    // Two sum problem
    static void twoSum(int arr[], int n, int target){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((arr[i]+arr[j]) == target){
                   System.out.print("Yes exist and that is : ");
                   System.out.println("("+i+" , "+j+")");
                   count++;
                   break; 
                } 
            }
        }
        if(count == 0){
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,9,11};
        int n=arr.length;
        int target = 14;
        twoSum(arr, n, target);
    } 
}
