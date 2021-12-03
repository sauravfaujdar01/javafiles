 // for printing reverse of an array, taking input by command line
public class arrayQues1 {
    public static void main(String[] args) {
        int a = args.length;
        int arr[][]=new int[4][4];
        if(a<4)
            System.out.println("enter array elements5");
        if (a==4) {
            int k=0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                arr[i][j]=Integer.parseInt(args[k]);
                k++;
                }
            }
            System.out.println("the given array is ");
            for (int i=0;i<2;i++){
                for (int j=0;j<2;j++){
                    System.out.print(arr[i][j]+ "  ");
                }
                System.out.println();
            }
        }
        System.out.println("The reverse of array is:");
        for(int i=1;i>=0;i--)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
