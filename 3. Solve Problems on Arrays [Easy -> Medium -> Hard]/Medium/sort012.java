public class sort012 {
    static void sort012s(int arr[], int n){
        //make an hash array as temp
        int []hash = new int[n];
        for(int i=0;i<n; i++){
            if(arr[i]==0){
                hash[arr[i]]+=1;
            }else if(arr[i]==1){
                hash[arr[i]]+=1;
            }else{
                hash[arr[i]]+=1;
            }
        }

        int temp[]= new int[9];
        int n1= hash[0];
        int n2= hash[1];
        int n3= hash[2];
        
        // now we have got idea about how much 0's 1's 2's are there int the array.
        for(int i =0; i<n1; i++){
            temp[i]= 0;
        }
        for(int i =n1; i<n1+n2; i++){
            temp[i]= 1;
        }
        for(int i =n1+n2; i<n1+n2+n3; i++){
            temp[i]= 2;
        }

        //output
        System.out.print("[ ");
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" , ");
        }System.out.println(" ]");
        
    }
    public static void main(String[] args) {
        int arr[] ={0,1,1,1,0,2,2,1,0};
        int n= arr.length;
        sort012s(arr, n);
    }
}
