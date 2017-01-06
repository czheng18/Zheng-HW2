import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Police p1 = new Police();
		Teacher t1 = new Teacher();
		Scanner input = new Scanner(System.in);
		System.out.printf("What is your job\n1.Police         2.Teacher\n");
		int choice = input.nextInt();
		if (choice == 1){
			System.out.printf("1.Give payroll        2.Ask ID\n");
			int select = input.nextInt();
			if(select == 1)
				p1.givepay();
			else 
				p1.askID();
		}
		else{
			System.out.printf("1.Give payroll        2.Ask ID\n");
			int select = input.nextInt();
			if(select == 1)
				t1.givepay();
			else{
				t1.askID();
			}
				
		}
	}
}
