import java.util.Scanner;

public class practiceQ {
    
    static void strpalindrome(String name, int i, String temp){
        //base case
        if(i<0){
            if(name.equals(temp)){
                System.out.println("palindrome");
            }else{
                System.out.println("Not palindrome");
            }
            return;
        }

        //work
        
        temp = temp + name.charAt(i);

        //recursive call
        strpalindrome(name, i-1, temp);      
    }

    public static void main(String[] args) {

        String name = "nitin";
        String temp = "";
        int size = name.length()-1;
        // String result =strpalindrome(name, size,temp);
        
        strpalindrome(name, size,temp);
    }
}
