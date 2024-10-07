package BasicQuestion;

import java.util.Scanner;

public class RevNumber {
    public static long reverse_digit(long n)
    {
        // Code here
        long rev = 0;
        while(n>0){
            long lastD = (n%10);
            rev = 10*rev + lastD;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse_digit(2024));
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("num : " + n);
        }while(n !=0);

    }
}
