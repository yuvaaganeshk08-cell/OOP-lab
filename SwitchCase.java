import java.util.Scanner;
public class SwitchCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("***Simple Calculator***");
		System.out.print("Enter the first number:");
		double x = sc.nextDouble();
		System.out.print("Enter the second number:");
		double y = sc.nextDouble();
		
		System.out.println("***Operations***");
		
		System.out.println("1.addition");
		System.out.println("2.subration");
		System.out.println("3.multiplication");
		System.out.println("4.divition");

		System.out.println("****************");

		System.out.print("Select the operation from above (Enter the number):");
		int z = sc.nextInt();
		
		System.out.print("Your answer is:");
		switch(z){
			case 1:
				System.out.println(x+y);
				break;

			case 2:
				System.out.println(x-y);
				break;

			case 3:
				System.out.println(x*y);
				break;

			case 4:
				if(y == 0){
					System.out.println("Not defined");
}
				else{
					System.out.println(x/y);
}
				break;

			default:
				System.out.println("Invalid Operation");
}

		System.out.println("***Thank You***");
		sc.close();

}}