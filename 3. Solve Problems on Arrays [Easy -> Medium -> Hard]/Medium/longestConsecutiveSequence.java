class longestConsecutiveSequence{
    // Longest Consecutive Sequence in an Array
    static int consective(int arr[] , int n){
        int count = 1;
        int prevElement = arr[0];
        int current = 1;

        for(int i=0; i<arr.length; i++){

            if(arr[i]== prevElement+1){
                current++;
            }else if(arr[i]!=prevElement){
                current=1;
            }

            prevElement = arr[i];
            count=Math.max(current, count);
        }return count;        
    }

    public static void main(String[] args) {
        int arr[] = {3,8,9,0,1,5,6,7};
        int n= arr.length;
        System.out.println(consective(arr, n));
    }
}