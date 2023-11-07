package selfedu;

public class Main{
    public static void main(String[] args) {

        Point<Integer> point = new Point<>();
        Point<Double> pointD = new Point<>();

        point.x = 1;
        point.y = 2;
        pointD.x = 2.5;
        pointD.y = 1.5;
        System.out.println(point.x + " " + point.y);
        System.out.println(pointD.x + " " + pointD.y);

    }
}


class Point<anus>{
    public anus x, y;
}