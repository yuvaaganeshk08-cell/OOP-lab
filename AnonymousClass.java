public class AnonymousClass {
    public static void main(String[] args){

        Human human1 = new Human();
       // Tamilar tamilar = new tamilar();
        //-----------AnonymousClass------------
        Human human2 = new Human(){
            @Override
            void speak(){
                System.out.println("Tamilar Speaks Tamil");
            }
        };// Cannot be reused

        human1.speak();
        human2.speak();
       // tamilar.speak();


    }
    
}

class Human{

    void speak(){
        System.out.println("Humans Speaks many languages");
    }
}

/*class Tamilar extends Human{

    @override
    void speak(){
        System.out.println("Tamilar speaks Tamil");
    }
}
*/
