package net.sanjeev.whileex;

public class dowhile {
    public static void main(String[] args) {
        int i = 1;
        int f = 1;
        int n = 10;

        do {
            f=f*i;
            i++;
        }while(i<n);

        System.out.println("Factorial of "+n+" is "+f);
    }
}
