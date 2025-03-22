import java.util.Scanner;

public class prime {
    public static void main(String [] args){
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int flag = 0;
        for (int i=2;i<=a/2;i++){
            if (a%i==0){
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
    }
}
