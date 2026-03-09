public class Interface {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Frog frog = new Frog();
        Hawk hawk = new Hawk();

        rabbit.flee();
        frog.flee();
        frog.hunt();
        hawk.hunt();
    }
}

interface Predator{
    void hunt();
}

interface Prey{
    void flee();
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is runninng away!");
    }

}

class Frog implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("The frog is jumping away!");
    }

    @Override
    public void hunt(){
        System.out.println("The frog is hunting!");
    }

}

class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting!");
    }
}