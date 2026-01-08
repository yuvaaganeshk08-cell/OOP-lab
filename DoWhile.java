import java.util.Scanner;
public class DoWhile{
	public static void main(String[] yg){
	Scanner x = new Scanner(System.in);
	int i;
	do{
	System.out.print("Enter a positive number:");
	i = x.nextInt();
	System.out.println("Your input is:" + i);
}
	while(i>=0);

	x.close();


}}