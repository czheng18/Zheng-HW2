
public class PersonTest {
	public static void main(String[] args){
		Person person1 = new Person("Evan", 24, "509-001-1234");
		Person person2 = new Person ("Mark", 50, "425-324-2345" );
		Person person3 = new Person("Jan", 5, "509-123-1234");
		System.out.println("Name: " + person1.getname() + "\nAge: " + person1.getage() + "\nPhone number: " + person1.getphone_number());
		System.out.println("\nName: " + person2.getname() + "\nAge: " + person2.getage() + "\nPhone number: " + person2.getphone_number());
		System.out.println("\nName: " + person3.getname() + "\nAge: " + person3.getage() + "\nPhone number: " + person3.getphone_number());
	}
}
