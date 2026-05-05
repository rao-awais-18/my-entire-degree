class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine = new Engine();

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}