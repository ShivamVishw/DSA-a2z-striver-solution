import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {

        //check palindrome 
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp= 0;
        for(int i=1;i<Math.min(num1,num2); i++){
            if(num1%i==0 && num2%i==0){
                temp =i;
            }
        }System.out.println("HCF of "+num1+" and "+num2+" is "+temp);
    }
}
