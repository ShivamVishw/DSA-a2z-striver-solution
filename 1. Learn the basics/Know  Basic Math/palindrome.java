import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        //check palindrome 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse=0;
        int temp= number;
        while(number!=0){
            int reminder = number%10;
            reverse= reverse*10 +reminder;
            number = number/10;
        }
        System.out.println(reverse);
        //now check if reverse equal to original number or not 
        if(temp== reverse){
            System.out.println("The given number is Palindrome");
        }else{
            System.out.println("The given number is not Palindrome");
        }
        
    }
}
