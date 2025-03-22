import java.util.*;
public class vowel {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word");
    String s = sc.nextLine();
    for (int i =0;i<s.length();i++){
        char a = s.charAt(i);
        a = Character.toLowerCase(a);
        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println(a+":Vowel");
        }
        else{
            System.out.println(a+":Consonant");
        }
    }
    sc.close();
    }
    
}
