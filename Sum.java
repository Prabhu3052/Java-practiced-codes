import java.util.Scanner;

public class Sum {
    public static void main(String []args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int sum = a+b;
    System.out.println(sum);
    s.close();
    }
}
