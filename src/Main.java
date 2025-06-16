class Car {
    String brand;
    Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    class Engine {
        public void start() {
            System.out.println("The engin of " + brand + " 부릉부릉 ");
        }
    }

    public void startEngine() {
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("기아");

        car.startEngine();
    }
}