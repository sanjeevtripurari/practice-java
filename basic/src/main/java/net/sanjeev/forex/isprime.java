package net.sanjeev.forex;

public class isprime {
    public static void main(String[] args) {
        int x=50;
        boolean prime=true;

        System.out.println("Check if "+x+" is prime");
        for (int i=2;i<5;i++){
            if (x%i==0){
                prime=false;
                break;
            }
        }

        if (prime){
            System.out.println(x+" is prime");
        }else{
            System.out.println(x+" is not prime");
        }
    }
}
