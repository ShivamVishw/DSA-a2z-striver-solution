public class appearsOnceTwice {
    static void appearOnceTwice(int arr[], int n) {

        int hash[]= new int[20];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    hash[arr[j]]+=1;
                    
                }
            }
        }
        
        for(int i =0 ; i<n; i++){
            if(hash[i]==1){
                System.out.println(i+" has comes once");
            }

            if(hash[i]==2){
                System.out.println(i+" has comes twice");
            }
        }
        
        
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,3,4,2,0,0,0};
        int n= arr.length;
        appearOnceTwice(arr, n);
    }
}
