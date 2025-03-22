import java.util.Scanner;

public class fibo {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First num:");
        int a = s.nextInt();
        System.out.print("Enter Second num:");
        int b = s.nextInt();
        System.out.print("Range:");
        int n = s.nextInt();
        System.out.print(a);
        System.out.print(b);
        for (int i=2;i<=n;i++){
            int c =a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            s.close();
        }

    }    
}
