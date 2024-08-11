public class practiceQ {
    static void armstrong(int n){
        
        int temp = n;
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans+= rem*rem*rem;
            n=n/10;
        }

        // return ans;
        if(temp== ans){
            System.out.println("yes");
        }else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {

        armstrong(153);
    }
}

//output 
// input = 153    output === Yes
