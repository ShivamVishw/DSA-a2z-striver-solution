import java.util.Scanner;
public class countFrequency {
    // Number hashing 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr= new int[size];
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        //Precalculation
        //create HASH ARRAY
        int hash[] = new int[20];
        for(int i=0; i<size; i++){
            hash[arr[i]]+=1;
        }

        //query
        System.out.println("Enter number of query");
        int q= sc.nextInt();
        while(q!=0){
            int number = sc.nextInt();
            q--;
            System.out.println(number+" has arises "+hash[number]+" times");
        }
        
    }   
}
