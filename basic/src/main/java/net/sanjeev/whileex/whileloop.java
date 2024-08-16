package net.sanjeev.whileex;

public class whileloop {
    public static void main(String[] args) {
        int i=0;
        int n=15;
        int sum=0;

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first "+n+" numbers is "+sum);
    }

}
