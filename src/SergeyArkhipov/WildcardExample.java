package SergeyArkhipov;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        // Подходящий тип любого элемента верхний ограничитель (<? extends E>)
        List<? extends Number> numbers = new ArrayList<Integer>();
        // Нельзя добавлять элементы
//         numbers.add(3.14);

        // Подходящий верхний ограничитель любой супертип (<? super E>)
        List<? super Integer> integers = new ArrayList<Number>();
        integers.add(3);
        // Нельзя явно извлечь элемент
        // int number = integers.get(0);

        // Неограниченные вайлдкарды (<?>)
//        List<?> objects = new ArrayList<String>();
//        Object obj = objects.get(0); // можно получить элемент, но только как Object
        // Нельзя добавлять элементы
        // objects.add("Hello");
    }
}