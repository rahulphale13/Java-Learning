class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting with a key");
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
    }
}