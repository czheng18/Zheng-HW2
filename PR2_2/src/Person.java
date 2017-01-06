
public class Person {
	private String name;
	private int age;
	private String phone_number;
	
	public Person(String n, int a, String pn){
		name = n;
		age = a;
		phone_number = pn;
	}
	
	public void setname(String newname){
		name = newname;
	}
	
	public void setage(int newage){
		age = newage;
	}
	
	public void setphone_number(String newphone_number){
		phone_number = newphone_number;
	}
	
	public String getname(){
		return name;
	}
	
	public int getage(){
		return age;
	}
	
	public String getphone_number(){ 
		return phone_number;
	}
}
