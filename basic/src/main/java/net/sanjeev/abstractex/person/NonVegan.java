package net.sanjeev.abstractex.person;

public class NonVegan extends  Person{

    @Override
    public void eat(){
        System.out.println("Eats non vegan food.");
    }

}
