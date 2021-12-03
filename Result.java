// a class having an abstract method then class should also have to  be abstract
// an abstract class can have non-abstract method(concrete method)
abstract class First{

    abstract public void method1();
}
class second extends First{         //extends-for extending the functionality of child class from parent class

    @Override
    public void method1() {
        System.out.println("welcome");
    }
}
public class Result {
    public static void main(String[] args) {
        second obj1 =new second();
        obj1.method1();
    }
}
