package SergeyArkhipov;

import java.util.ArrayList;

public class Main{

    static class Fruit{
    }

    static class Citrus extends Fruit{
    }

    static class Orange extends Citrus{
    }

    static class BigRoundOrange extends Orange{
    }

    public static void main(String[] args) {
        ArrayList<? super Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Citrus());
        fruits.add(new Orange());
        fruits.add(new BigRoundOrange());

//        ArrayList<? extends Orange> fruits2 = new ArrayList<>();
//        fruits2.add(new Fruit());
//        fruits2.add(new Citrus());
//        fruits2.add(new Orange());
//        fruits2.add(new BigRoundOrange());

    }



}
