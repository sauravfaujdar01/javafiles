//program for checking the given number is palindrome or not
import java.util.Scanner;

class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, reversedNum = 0, remainder;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
