package lab2;
import java.util.*;
public class lab2_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    if (x>50000.00) {
      System.out.print(x/100*10);
    }else{
      System.out.print(x/100*5);
    }
  }
}