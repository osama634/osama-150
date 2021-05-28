import java.util.Scanner;
public class Result extends Marks {

	public static void main(String[] args) {
		Marks ob1 = new Marks();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name,rollNo,batch;
		name = sc.nextLine();
		System.out.println("Enter your Roll No : ");
		rollNo=sc.next();
		System.out.println("Enter your Batch : ");
		batch=sc.next();
		System.out.println("\n\t\t\t\t SSUET  	");
		System.out.println("\n\t\tStudent Name   : "+name);
		System.out.println("\n\t\tStudent Rollno : "+rollNo);
		System.out.println("\n\t\tStudent Batch  : "+batch);
		
		ob1.grade(85, 80, 75, 60, 82);

	}
	

}
