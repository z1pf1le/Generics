package selfedu;

import java.awt.*;

public class Main{
    public static void main(String[] args) {
        Point<Integer> pt = new Point<>(12, 22);
        Point<Double> ptD = new Point<>(12.5, 22.6);

        System.out.println(pt.x + " " + pt.y);
        System.out.println(ptD.x + " " + ptD.y);

        for(Object coord: ptD.getCoords())
            System.out.println((double)coord);
    }
}

class Point<T> {
    public T x, y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    Object[] getCoords() {
        return new Object[] {x, y};
    }
}


