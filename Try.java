// for printing sum of an array
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[7];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Your array elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ "  ");
        }
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
           sum1+=arr[i];
        }
        System.out.println(sum1);
    }
}