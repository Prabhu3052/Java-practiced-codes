import java.util.Scanner;

public class reversenum {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        System.out.println(revnum(a));
        s.close();
    }
    public static int revnum(int a) {
        int rev =0;
        while(a!=0){
            int rm = a%10;
            rev = rev*10+rm;
            a = a/10;
        }
        return rev;
    }
    }
    

