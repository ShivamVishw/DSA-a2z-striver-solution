import java.util.ArrayList;
public class mergeSort {
    static void merge(int arr[], int low, int mid, int high){


        //make one temporary array which store manupulated data 
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        //starting from mid+1 to till end 
        int right = mid+1;

        //now do something to store element in temp in sorted way
        while(left<= mid && right<=high){
            if((arr[left]<= arr[right])){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        //so if element in left are still left so..
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        // and also if element in right are still left so..
        while(right<= high){
            temp.add(arr[right]);
            right++;
        }


        //now merge all the element from temporary into original array
        for(int i=low; i<=high;i++){
            arr[i]= temp.get(i-low);
        }
    }

    public static void mergesort(int arr[], int low, int high){
        // base case
        if(low>=high){
            return;
        }

        // find middle index
        int mid = (low +high)/ 2;
        // hypothetical left array
        mergesort(arr, low, mid);
        //hypothetical right array
        mergesort(arr, mid+1, high);
        // now merge those sorted left and right 
        merge(arr,low,mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,7,1,10,34,21,32};
        int n = arr.length;
        //before sorted
        System.out.println("Before sorted");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        mergesort(arr, 0, n-1);
        System.out.println("After sorted");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

    }
}
