package net.sanjeev.methodex;

public class method2 {
    public static void main(String[] args) {
        int length=10;
        int breadth=20;

        System.out.println("Length: "+length+", Breadth: "+breadth);
        System.out.println("Area is: "+area(length,breadth));

        float l=10.12f;
        float b=11.33f;
        System.out.println("Length: "+l+", Breadth: "+b);
        System.out.println("Area is: "+area(l,b) );

    }


    public static double area(float l, float b) {
        double area=l*b;
        return area;

    }
    public static float area(int length, int breadth) {
        float area=length*breadth;
        return(area);

    }
}
