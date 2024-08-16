package net.sanjeev.interfacesex;

import net.sanjeev.interfacesex.phone.Iphone8;
import net.sanjeev.interfacesex.phone.OnePlus5;
import net.sanjeev.interfacesex.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone=new OnePlus5();
        Phone iphone=new Iphone8();

        System.out.println("Processor: "+phone.processor());
        System.out.println("Space in GB: "+phone.spaceInGB());

        System.out.println("Processor: "+iphone.processor());
        System.out.println("Space in GB: "+iphone.spaceInGB());
    }
}
