
public class practiceQ {

        static void reverseRec(int arr[], int i){

        //base case
        if(i<0){
            return;
        }
        //work
        System.out.print(arr[i]+", ");
        //recursive call
        reverseRec(arr, i-1);
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        reverseRec(arr, arr.length-1);
        
    }
}

//output 
// 5 4 3 2 1
