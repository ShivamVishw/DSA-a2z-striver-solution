import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {

        //reverse the number 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse=0; 
        while(number!=0){
            int reminder =number%10;
            reverse= reverse*10 +reminder;
            number= number/10;
        }
        System.out.println("The reverse of the given number is "+ reverse);
        
        
    }
}
