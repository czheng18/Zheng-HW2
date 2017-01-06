
public class PersonTest {
	public static void main(String[] args){
		Person person1 = new Person("Evan", 24, "509-001-1234");
		Person person2 = new Person ("Mark", 50, "425-324-2345" );
		Person person3 = new Person("Jan", 5, "509-123-1234");
		Police p1 = new Police();
		Teacher t1= new Teacher();
		Kid k1 = new Kid();
		System.out.println(person1.getname() + p1.setPatrol());
		System.out.println(person2.getname() + t1.setrankA());
		System.out.println(person3.getname() + k1.setCandy4());
	}
}
