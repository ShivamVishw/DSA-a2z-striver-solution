import java.util.ArrayList;
public class arrangePosNeg {
    static int[] rearrangeArray(int []arr,int n){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negetive = new ArrayList<>();       

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                negetive.add(arr[i]);
            }else{
                positive.add(arr[i]);
            }
        }
        for(int i=0; i<n/2; i++){
            
            if((2*i)%2==0){
                arr[i] = positive.get(i);
            }else{
                arr[i]= negetive.get(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={4,-1,-5,5};
        int n= arr.length;
        int ans[] = rearrangeArray(arr, n);
        System.out.print("[ ");
        for(int i=0; i<n;i++){
            System.out.print(ans[i]+" ");
        }System.out.print(" ]");
        System.out.println();
        
    }
}
