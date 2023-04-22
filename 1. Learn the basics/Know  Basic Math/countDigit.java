import java.util.Scanner;

public class countDigit {

    //
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number below ");
        int n =sc.nextInt();
        
        //convert number to string 
        String n2= Integer.toString(n);
        System.out.println("Number of digint in "+n+" is "+n2.length());
    }
}

