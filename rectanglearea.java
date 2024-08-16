public class rectanglearea{
	public static void main(String[] args){
		double length=10;
		double breadth=20;
		double area=areaofrectangle(length, breadth);

		System.out.println("Rectangle length:"+length);
		System.out.println("Rectangle breadth:"+breadth);

		System.out.println("Area: "+area);
	}
		public static double areaofrectangle(double length, double breadth) {
			double area=length*breadth;
			return (area);
			
		}
	}
