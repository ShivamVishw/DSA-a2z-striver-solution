import java.util.Scanner;
public class prime {
    public static void main(String[] args) {

        // print all divisor 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0 || n==1){
            System.out.println("Not prime");
            return;
        }
        int temp=0;
        for(int i=2;i<n; i++){
            if(n%i==0){
                temp++;
            }
        }
        if(temp==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
