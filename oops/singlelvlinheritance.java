import java.util.*;
import bank;

class Shape{
    public void area(){
        System.out.println("Dispalys area");
    }
}
//single level inheritance
class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
//multi level inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

//herarichal level of inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class singlelvlinheritance {
    public static void main(String[] args){
        bank.Account account1 = new bank.Account();
        account1.name = "Customer1";
    }
    
}
