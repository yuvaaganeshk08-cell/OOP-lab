import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int mat,phy,che,bio,eng,i,stu;
		double avg;
		boolean res = true;
		/*System.out.print("Enter how many students:");
		stu = scanner.nextInt();
		System.out.println(stu);*/
		while(res){
			System.out.println("***Welcome To Grade calculator***");
			System.out.print("Enter maths marks:");
			mat = scanner.nextInt();
			System.out.print("Enter physics marks:");
			phy = scanner.nextInt();
			System.out.print("Enter chemistry marks:");
			che = scanner.nextInt();
			System.out.print("Enter biology marks:");
			bio = scanner.nextInt();
			System.out.print("Enter english marks:");
			eng = scanner.nextInt();

			avg = (mat+phy+che+bio+eng)/5;
			if(avg>95.0){
				System.out.println("Grade:O");}
			else if (avg>90.0){
				System.out.println("Grade:A+");}
			else if (avg>80.0){
				System.out.println("Grade:A");}
			else if (avg>75.0){
				System.out.println("Grade:B+");}
			else if (avg>70.0){
				System.out.println("Grade:B");}
			else if (avg>65.0){
				System.out.println("Grade:C+");}
			else if (avg>60.0){
				System.out.println("Grade:C");}
			else {
				System.out.println("Grade:F");}	
			System.out.print("Do you want to calculate grade for another (true/false):");
			res = scanner.nextBoolean();		
}
			System.out.println("***Thank You***");
		scanner.close();
		
}	
}

