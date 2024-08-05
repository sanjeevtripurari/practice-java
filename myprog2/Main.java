class Test<T>{
	T obj;

	Test(T obj){
		this.obj=obj;
	}
	
	public T getObject(){
		return this.obj;
	}
}

class Test2 {
	static <T> void genericDispla(T element){
		System.out.println(element.getClass().getName()+" = "+element);
	}
}

class Student {
	int rno;
	String name;
	int marks;
	double avg;
	
	Student(int rno, String name, int marks, double avg){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
		this.avg=avg;
	}
	
	Student(){}
}

public class Main{
	public static void main(String[] args){
		System.out.println("Hello World!!");
		
		Student s = new Student();
		s.rno=1; 
		s.name="Ajay"; 
		s.marks=10;
		s.avg=10.55;

		Student r = new Student(2, "Rahul", 20, 29.4);

		System.out.printf("R.No.: %d\nName: %s\nMarks: %d\nAvg: %.2f\n",s.rno, s.name, s.marks, s.avg);
		System.out.printf("R.No.: %d\nName: %s\nMarks: %d\nAvg: %.2f",r.rno, r.name, r.marks, r.avg);

		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println("\nTest<Integer>: "+iObj.getObject());

		Test<String> sObj = new Test<String>("GeeksforGeeks");
		System.out.println("\nTest<String> : "+sObj.getObject());

		genericDisplay(11);
		genericDisplay("GeeksforGeeks");
		genericDisplay(11.11);
		
	}
}
