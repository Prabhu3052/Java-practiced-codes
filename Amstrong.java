import java.util.*;

public class Amstrong {
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        int org = a;
        String j = a + "";
        int z = j.length();
        int c =0;
        while (a!=0){
            int b = a%10;
            c+=Math.pow(b,z);
            a = a/10;
        }
        if (c==org){
            System.out.print("Amstrong");
        }
        else{
            System.out.print("Not Amstrong");
            s.close();
        }
    }
}
