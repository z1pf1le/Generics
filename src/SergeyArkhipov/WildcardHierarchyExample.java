package SergeyArkhipov;

class Fruit {
    public void display() {
        System.out.println("I am a fruit.");
    }
}

class Apple extends Fruit {
    public void display() {
        System.out.println("I am an apple.");
    }
}

class Orange extends Fruit {
    public void display() {
        System.out.println("I am an orange.");
    }
}

class FruitBox<T extends Fruit> {
    private T fruit;

    public FruitBox(T fruit) {
        this.fruit = fruit;
    }

    public void displayFruitInfo() {
        fruit.display();
    }
}

public class WildcardHierarchyExample {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());

        appleBox.displayFruitInfo();
        orangeBox.displayFruitInfo();
    }
}
