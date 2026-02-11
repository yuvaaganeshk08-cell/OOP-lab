class Nokia{
	void call(){
		System.out.println("You can make call");
	}

	void message(){
		System.out.println("You can message");
	}

}

class Iphone extends Nokia{

	void display(){
		System.out.println("Touch display");
	}

}

class Inheritance{

	public static void main(String[] args){
		Iphone ip = new Iphone();
		Nokia no = new Nokia();
		ip.display();
		no.call();
	}
}