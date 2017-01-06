import java.util.Arrays;

public class main {
	public static void main(String[] args){
		Building b1 = new Building();
		System.out.printf("All buildings: \n");
		b1.addBuildings("Whitworth University");
		b1.addBuildings("Spokane City Hall");
		b1.addBuildings("Northtown Mall");
		b1.showbuidlings();
		
		System.out.printf("\nAll people: \n");
		Person p1 = new Person();
		Person p2 = new Person("Luke",18);
		Person p3 = new Person("Pete", 40);
		Person p4 = new Person("Vector", 26);
		p1.addPersons("Luke");
		p1.addPersons("Pete");
		p1.addPersons("Vector");
		p1.showName();
		
		p2.getage();
		p3.getage();
		p4.getage();
	}
}
