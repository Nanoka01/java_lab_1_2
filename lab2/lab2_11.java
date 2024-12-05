package lab2;
import java.util.*;

public class lab2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your money : ");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        String y = sc.nextLine();

        switch (y) {
            case "A":
                System.out.println("Your total money in one year = " + (x / 100 * 1.5+x));
                break;
            case "B":
                System.out.println("Your total money in one year = " + (x / 100 * 2+x));
                break;
            case "C":
                System.out.println("Your total money in one year = " + (x / 100 * 1.5+x));
                break;
            case "X":
                System.out.println("Your total money in one year = " + (x / 100 * 5+x));
                break;
        }
    }
}
