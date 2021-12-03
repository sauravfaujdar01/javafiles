// program to display tens digit of a given number for 0<=N<=1000000
import java.util.Scanner;

public class Tens {
    public static void main(String[] args) {
        int num;
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println((num/10)%10);
    }

}

