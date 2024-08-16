package net.sanjeev.switchex;

public class hellloswitch2 {
    public static void main(String[] args) {
        char x = 'A';

        switch (x){
            case 'a':
            case 'A':
                System.out.println("value of x is a");
                break;

            case 'b':
                System.out.println("Value of x is b");
                break;
            default:
                System.out.println("no case-switch for x");
                break;

        }
    }
}
