public class HybridInhert{
	public static void main(String[] args){
	
	Fastfood fs = new Fastfood();
	Drinks ds = new Drinks();

	fs.eat();
	fs.food();
	fs.fastfood();
	ds.drinks();
}
}

class Edible{

	void eat(){
		System.out.println("WE ARE EATABLE");                                                                                                                                               

}
}

class Food extends Edible{

	void food(){
		System.out.println("FOODS ARE EATABLE");
}	
}

class Fastfood extends Food{

	void fastfood(){

		System.out.println("FASTFOOD IS ALSO FOOD");
}}

class Drinks extends Edible{

	void drinks(){

		System.out.println("DRINKS ARE ALSO EDIBLE");
}}

