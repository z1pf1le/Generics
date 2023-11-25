package SergeyArkhipov;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class WildcardExampleInv{


    public static void main(String[] args) {
        // Неограниченные вайлдкарды (<?>)
        List<?> objects = new ArrayList<String>();
        Object obj = objects.get(0); // можно получить элемент, но только как Object
        // Нельзя добавлять элементы
        // objects.add("Hello");
//        System.out.println(obj);
    }
}
