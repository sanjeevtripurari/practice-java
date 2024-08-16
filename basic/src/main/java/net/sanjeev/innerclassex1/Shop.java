package net.sanjeev.innerclassex1;

import net.sanjeev.innerclassex1.shop.Door;

public class Shop {
    public static void main(String[] args) {
        Door door=new Door();
        door.shopStatus();;
        door.getLock().setLock(true);
        door.shopStatus();
    }
}
