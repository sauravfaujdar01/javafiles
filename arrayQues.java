// program which prints true only if given array contains only 1 and 4
import java.util.Scanner;

public class arrayQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,k = 0;
        int [] arr = new int[5];
        System.out.print("Enter elements of array: ");
        for(i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Your array elements are: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        //checking elements
    for (i=0;i< arr.length;i++){
        if(arr[i]==1 || arr[i]==4)
            k++;
        }
        if (k== arr.length)
            System.out.println("TRUE");
        else
            System.out.println("false");


    }
}
