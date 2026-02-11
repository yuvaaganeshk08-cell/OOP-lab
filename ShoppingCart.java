import java.util.Scanner;
public class ShoppingCart{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String item;
		double price;
		int quant;
		double total = 0;
		char currency='₹';
		boolean result = true;
		while(result){
		System.out.print("Enter the item name: ");
		item = scanner.nextLine();
		System.out.println(item);
		System.out.println("");
		System.out.print("Enter it's price: ");
		price = scanner.nextDouble();
		System.out.println(price);
		System.out.print("Enter the quantity: ");
		quant = scanner.nextInt();
		System.out.println(quant);
		total = total + (price*quant);
		System.out.print("Do you want to add items? (true/false):"); 
		result = scanner.nextBoolean();}
		System.out.println("Your total amount is "+currency+ total);
		scanner.close();
}}