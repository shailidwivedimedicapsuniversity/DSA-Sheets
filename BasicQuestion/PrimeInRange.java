package BasicQuestion;
import java.util.ArrayList;

public class PrimeInRange{
    public static ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i=M; i<=N; i++){
            if(i==1){
                //  1 is not prime or non prime
                continue;
            }
            
            boolean flag = false;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                flag = true;
                   break;
                }
            }
            if(flag == false){
                list.add(i);
            }
           
            
        }
        return list;
    }
    public static boolean checkPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
                //non prime num
            }
        }
        return true;
        //prime number
    }
    public static void main(String args[]){
        System.out.println(primeRange(1, 10));
        System.out.println(checkPrime(9));
    }
}