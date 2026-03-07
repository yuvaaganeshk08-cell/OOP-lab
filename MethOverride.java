public class MethOverride{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.move();

        Cat c1 = new Cat();
        c1.move();

        Fish f1 = new Fish();
        f1.move();

    }
}
 

class Animal{
    void move(){
        System.out.println("This animal can run");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Fish extends Animal{

    @Override
    void move(){
        System.out.println("This animal can swim");
    }
}