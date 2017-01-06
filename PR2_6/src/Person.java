import java.util.ArrayList;
public class Person {
	private ArrayList<String>persons = new ArrayList<String>();
	private int age;
	private String name;
	Teacher t1 = new Teacher();
	Police po1 = new Police();
	School s1 = new School();
	CityHall ch1 = new CityHall();
	public Person(String n, int a){
		name = n;
		age = a;
	}
	public Person(){
		
	}
	public void addPersons(String name){
		persons.add(name);
	}
	public void showName(){
		for(String p:persons)
			System.out.printf("%s\n",p);
	}
	public void getage(){
		if(age < 21){
			System.out.printf("%s is a kid\n", name);
			System.out.printf("%s doesn't have a job yet\n", name);
			s1.isatSchool();
		}
		else if(age >= 35){
			System.out.printf("%s is an adult\n", name);
			t1.isATeacher();
			s1.isatSchool();
			t1.givepay();
		}
		else if (age >= 25 && age <35){
			System.out.printf("%s is an adult\n", name);
			po1.isAOfficer();
			ch1.isatCityHall();
			po1.givepay();
		}
	}
}
