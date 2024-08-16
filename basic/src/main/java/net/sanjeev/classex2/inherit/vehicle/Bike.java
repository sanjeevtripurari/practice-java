package net.sanjeev.classex2.inherit.vehicle;

import net.sanjeev.classex2.inherit.parent.Vehicle;

public class Bike extends Vehicle {
    public String handle;


    public Bike() {
        this.handle = "short";
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public Bike(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }


    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }
    public void run(){
        System.out.println("Running bike");
        System.out.println(toString());
    }
}
