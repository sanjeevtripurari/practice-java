package net.sanjeev.switchex;

public class helloswitch3 {
    public static void main(String[] args) {
        String x="Wednesday";

        switch(x.toLowerCase()){

            case
                "monday":
                System.out.println("x has Monday");
                break;
            case
                "tuesday":
                System.out.println("x has Tuesday");
                break;

            case
                "wednesday":
                System.out.println("x has Wednesday");
                break;

            default:
                System.out.println("x has no switch case");
                break;
        }
    }
}
