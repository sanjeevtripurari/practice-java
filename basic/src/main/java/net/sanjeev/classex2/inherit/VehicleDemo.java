package net.sanjeev.classex2.inherit;

import net.sanjeev.classex2.inherit.vehicle.Bike;

public class VehicleDemo {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.handle="Short";
        bike.engine="Petrol";
        System.out.println(bike.engine);

        System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());

        Bike bike2=new Bike("deisel", 4, 5, 40, "LED", "long");
        System.out.println("Handle: "+bike2.getHandle());
        System.out.println("Engine type: "+bike2.getEngine());
        System.out.println("Number of seats"+bike2.getSeats());
        System.out.println("Fuel Capacity: "+bike2.getFuelTank());
        System.out.println("Head lamp type: "+bike2.getLights());
        System.out.println("Number of wheels: "+bike2.getWheels());

        bike2.run();

        Bike bike3=new Bike("Deisel", 4,5,40,"LED","short");

        bike3.run();
    }
}
