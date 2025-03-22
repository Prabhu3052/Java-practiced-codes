import java.util.Scanner;

public class factorial {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(facto(a));
        s.close();
    }
    public static int facto(int a){
        if (a==0){
            return 1;
        }
        else{
            return a*facto(a-1);
        }
        }
    }
