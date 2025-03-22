import java.util.*;

public class randlen {
    public static void main(String [] args){
        int a = (int) (Math.random() * 1000000);
        System.out.println(a);
        String b = a +"";
        System.out.println(b.length());
    }
}
