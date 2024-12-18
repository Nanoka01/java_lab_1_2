package lab3;

import java.util.Scanner;

public class lab3_10 {
    public static void main(String[] args) {
        int odd =0;
        int even=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num ==-1) {
                break;
            } else if (num%2 ==0) {
                even+=1;
            } else {
                odd+=1;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
