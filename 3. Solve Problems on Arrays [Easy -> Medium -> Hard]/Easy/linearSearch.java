import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        //for input 
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        //for output
        System.out.println("Enter element you want to search");
        int n= sc.nextInt();
        for(int i=0; i<size; i++){
            if(arr[i]==n){
                System.out.println("Element is found on "+i+" index");
            }
        }
    }  
}
