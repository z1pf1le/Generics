package wildcardsEx;

import java.util.ArrayList;

public class Application{
    public static void main(String[] args) {

     Object myObject = new Object();
     String myVar = "hello";
     myObject = myVar;

     Employee emp = new Employee();
     Accountant acc = new Accountant();
     emp = acc;

     ArrayList<?> employees = new ArrayList<>();
     ArrayList<Accountant> accountants = new ArrayList<>();
     employees = accountants;

    }
}
