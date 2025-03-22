import java.util.*;

public class countdigit {
    public static void main(String []args){
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = d.nextInt();
        String count = a + "";
        // while(a!=0){
        //     a = a/10;
        //     count++;
        // }

        System.out.println(count.length());
        d.close();
    }
    
}
