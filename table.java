import java.util.*;

public class table {
    public static void main(String [] args){
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = d.nextInt();
        System.out.print("Enter a range:");
        int range = d.nextInt();
        for (int i=1;i<=range;i++){
            System.out.println(i+"*"+a+"="+i*a);
        }
        d.close();
        
    }
    
}
