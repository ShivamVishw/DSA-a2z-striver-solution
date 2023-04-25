public class moveZero {
    // Move Zeros to end
    static void zeroEnd(int arr[],int n){
        int temp[] =new int[n];
        int m=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                temp[m]=arr[i];
                m++;
            }
        }
        //till now m has reached at index where non zero element finished
        //so m will d=go from that part to till n
        while(m<n){
            //now asign 0 till n from where m finished with non zero element
            temp[m]=0;
            m++;
        }
    
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,5,0,7};
        int n=arr.length;
        zeroEnd(arr, n);
    }    
}
