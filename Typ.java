public class Typ {
    public static void main(String[] args) {


        byte a1 = 23;
        short a2 = 44;
        int a3 = 2;
        short result = (short) (a1 + a2 + a3);    //if we want output in short or other data type we have to type cast it otherwise output will be in int by default
        System.out.println(result);
    }

}
