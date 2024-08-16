package net.sanjeev.methodex;

public class method1 {
    public static void main(String[] args) {
        // with odd nos
        int i = 1, step = 2;
        loop(i, step);

        // with even nos
        i = 0;
        step = 2;
        loop(i, step);
        // with jump 3
        i = 1;
        step = 3;
        loop(i,step);
    }

    public static void loop(int i, int step) {
        for (int j=i;j<=10;j+=step){
            System.out.print(j+ " ");
        }
        System.out.println();

    }
}
