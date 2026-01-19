import java.util.Random;

public class RandOm{
	public static void main(String[] args){
		Random rand = new Random();
		int num1;
		int num2;
		double num3;
		boolean isHeads;
		num1 = rand.nextInt(); // Gives random integer
		System.out.println(num1);

		num2 = rand.nextInt(1,7); //Gives random integer between an interval
		System.out.println(num2);

		num3 = rand.nextDouble(); //Gives random decimal between 0 and 1
		System.out.println(num3);

		isHeads = rand.nextBoolean(); //gives true or false randomly
	
		if(isHeads){System.out.println("Heads");}
		else{System.out.println("Tails");}
}}