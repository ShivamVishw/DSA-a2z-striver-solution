class Pattern8{
    

    public static void main(String[] args) {
        Otraingle(5);
    }
    static void Otraingle(int n){
        for(int row=n; row>=0; row--){
            int totalNoOfRow= row;
            
            //Now print spaces
            int spaces=n-totalNoOfRow;
            for(int s=0;s<=spaces; s++){
                System.out.print(" ");
            }

            //now print *
            for(int col=0; col<=totalNoOfRow;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
    
// Input 
// 5

// Output 
// * * * * * * 
//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 