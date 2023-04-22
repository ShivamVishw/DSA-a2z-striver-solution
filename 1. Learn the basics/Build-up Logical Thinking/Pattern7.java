class pattern7{


    public static void main(String[] args) {
        traingle(5);
    }
    static void traingle(int n){
        for(int row=0; row<=n; row++){
            int totalNoOfRow= row;

            //print spaces
            int spaces=n-totalNoOfRow;
            for(int s=0;s<=spaces; s++){
                System.out.print(" ");
            }
            //Now print *
            for(int col=0; col<=totalNoOfRow;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}

// Input 
// 5

// Output 
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 