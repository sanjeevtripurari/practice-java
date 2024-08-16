package net.sanjeev.innerclassex3;

import net.sanjeev.innerclassex3.shop.Door;

public class Shop {
    public static void main(String[] args) {
        Door door=new Door();

        if(door.getLock().isUnLocked(args[0])){
            System.out.println("Welcome, we are open");
        }else {
            System.out.println("We are closed now, please visit later");
        }

    }
}
