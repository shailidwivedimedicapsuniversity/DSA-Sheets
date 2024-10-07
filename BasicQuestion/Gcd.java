package BasicQuestion;
public class Gcd {
     
    public static int brute(int a, int b){
        // this is brute force not optimise
        int gcd = 1;
        for(int i = 2;i<= Math.min(a,b);i++){
            if(a%i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }


    public static int gcd(int a, int b){
        // ❌Optimized Approach -> Eucledian Algorithm TC O(Log(min(a,b))❌
        while(a> 0 && b> 0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }

        if(a == 0){
            return b;
        }
        return a;
    }

    public static int[] lcmgcd(int a, int b){
        int c = a*b;
        // find gcd
        int gcd = 1;
        while(a>0 && b> 0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a == 0){
            gcd = b;;
        }else{
            gcd = a;
        }

        

        int lcm = c/gcd;
        int arr[] = new int[2];
        arr[0] = lcm;
        arr[1] = gcd;

        return arr;


    }
    public static void main(String[] args) {
        int a = 19;
        int b = 19;

        int ans = gcd(a, b);
        System.out.println(ans);

        System.out.println(brute(a,b));

        int arr2[] = lcmgcd(a, b);

        for(int val : arr2){
            System.out.println(val);
        }
    }
}
