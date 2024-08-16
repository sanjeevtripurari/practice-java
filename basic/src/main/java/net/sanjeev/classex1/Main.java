package net.sanjeev.classex1;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car);
        System.out.println(car.run());

        car.setDoors("closed");
        car.setDriver("");
        car.setEngine("on");
        car.setSpeed(10);
        System.out.println(car.getSpeed());
        System.out.println(car);
        System.out.println(car.run());
    }
}
