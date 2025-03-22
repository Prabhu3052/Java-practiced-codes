import java.util.*;

public class primenumrange {
    public static void main(String [] args){
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a Start number:");
        int a = d.nextInt();
        System.out.print("Enter a End number:");
        int b = d.nextInt();
        System.out.println("Prime numbers between "+a+" and "+b+" are:");
        for (int i=a;i<=b;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        d.close();
    }
    public static boolean isPrime(int a){
        if (a<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(a);i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
}
