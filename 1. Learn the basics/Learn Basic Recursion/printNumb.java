import java.util.*;
public class printNumb {
    static void printNum(int n){
        //base case
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}
