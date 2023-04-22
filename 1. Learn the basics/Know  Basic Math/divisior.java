import java.util.Scanner;
public class divisior {
    public static void main(String[] args) {

        // print all divisor 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println();
        //output
        System.out.println("The divisor of number "+n+" is");
        for(int i=1; i<=n; i++){
            
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
