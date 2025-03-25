import java.util.*;
public class hashset{
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(76);
        set.add(12);
        set.add(45);
        set.add(77);
        set.add(13);
        set.add(99);
        set.remove(99);
        for (int i=0;i<=100;i++){
            if (set.contains(i)){
                System.out.println(i+" is in the set");
            }
            else{
                System.out.println(i+" is not in the set");
            }

        }
        // set.clear();
        if(set.contains(12)){
            System.out.println("The set is not empty");
        }
        else{
            System.out.println("The set is  empty");
        }
    }
    
}