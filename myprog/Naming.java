import java.util.ArrayList;

public class Naming{
	ArrayList<String> list;

	public Naming(ArrayList<String> instance){
		this.list=instance;
	}

	public String naming(int i){
		return list.get(i)+TypeNumbering.numbering(list.get(i));
	}
}
