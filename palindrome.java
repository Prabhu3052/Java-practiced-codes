import java.util.Scanner;


public class palindrome {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(pal(a));
        s.close();
    }
    public static boolean pal(String a){
        String rev = "";
        for (int i=0;i< a.length();i++){
            rev = a.charAt(i)+rev;
        }
        return rev.equals(a);
    }
}
