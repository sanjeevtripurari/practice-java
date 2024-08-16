package net.sanjeev.abstractex;

import net.sanjeev.abstractex.person.NonVegan;
import net.sanjeev.abstractex.person.Person;
import net.sanjeev.abstractex.person.Vegan;

public class Main {
    public static void main(String[] args) {
        Person john=new Vegan();
        john.speak();
        john.eat();
        john.breathe();
        john.message();
        System.out.println("****************");
        Person mia=new NonVegan();
        mia.speak();
        mia.eat();
    }
}
