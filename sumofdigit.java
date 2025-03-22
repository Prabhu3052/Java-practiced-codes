import java.util.*;

public class sumofdigit {
    public static void main(String [] args){
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = d.nextInt();
        int sum = 0;
        while(a!=0){
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println(sum);
        d.close();

    }
}
