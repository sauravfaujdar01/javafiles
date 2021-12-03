import java.util.Scanner;

public class Studn {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner sc = new Scanner(System.in);
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        Scanner scc = new Scanner(System.in);
        this.rollNo = scc.nextInt();
    }
}

class StudnMain{
    public static void main(String[] args) {
        Studn obj1 = new Studn();
        Studn obj2 = new Studn();



    }
}
