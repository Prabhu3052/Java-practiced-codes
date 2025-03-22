
import java.util.Scanner;
 
public class largest {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        if (a>b && a>c){
            System.out.println("A is biggest:"+a);
        }
        else if(b>a && b>c){
            System.out.println("B is Biggest:"+b);
        }
        else{
            System.out.print("C is biggest:"+c);
            s.close();
        }
    }    
}
