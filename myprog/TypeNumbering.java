public class TypeNumbering{

	static int string = 0;
	static int num = 0;
	static int bool = 0;
	static int Int = 0;

	public static String numbering(String s){
		switch(s){
			case "String" : return String.valueOf(++string);
			case "num" : return String.valueOf(++num);
			case "bool" : return String.valueOf(++bool);
			case "int" : return String.valueOf(++Int);
			default : return "you mistak how to use numering method";
		}
	}


	public static void numberReset(){
		string=0;
		num=0;
		bool=0;
		Int = 0;
	}
}
