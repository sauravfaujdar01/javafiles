//program for calculating bmi
import java.util.Scanner;

    class Patient {
    Scanner sc = new Scanner(System.in);
    String patientName;
    double height;
    double weight;
    double bmi;
    Patient(){
        System.out.print("enter name: ");
        patientName=sc.nextLine();
        System.out.print("enter height in meters: ");
        height=sc.nextDouble();
        System.out.print("enter weight: ");
        weight= sc.nextDouble();
    }
    public double computeBMI(){
        bmi= weight/(height*height);
        return bmi;
    }
}
    class Main{
        public static void main(String[] args) {
            Patient obj=new Patient();
            obj.computeBMI();
            System.out.println(obj.patientName);
            System.out.println(obj.bmi);
        }
    }