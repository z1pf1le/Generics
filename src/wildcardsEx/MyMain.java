package wildcardsEx;

import java.util.Arrays;
import java.util.List;

public class MyMain{
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        Anus.getSmth(intList);
        Anus.getSmth(stringList);

    }
}

class Anus{
    public static void getSmth(List<?> anus){
        System.out.println(anus);
    }

}