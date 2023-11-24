package ex1;

import alishev.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo<Integer, String> zoo = new Zoo<>();
        List<Dog> dogList = new ArrayList<>();
        List<Integer> intlist = new ArrayList<>();
        zoo.x = 1;
        zoo.y = "tygy";
        zoo.print();
        test(dogList );
        test(intlist);
    }

    public static void test(List<?> list) {
    }
}