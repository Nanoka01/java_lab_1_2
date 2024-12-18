package lab3;

import java.util.Scanner;

public class lab3_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();

        for(int a = 1;a<=num; a++){
            if (a%5==0) {
                System.out.print("/");
            }else{
                System.out.print("|");
            }
            
        }
    }
}
