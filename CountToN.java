package new_practice;
import java.util.Scanner;

public class CountToN {
    public void num(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count up to: ");
        int number = sc.nextInt();
        sc.close();
        
        CountToN counter = new CountToN();
        counter.num(number);
        System.out.println("Thank you :)");
    }
}
