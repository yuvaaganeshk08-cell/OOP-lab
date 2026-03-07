public class Static {
    public static void main(String[] args) {
        Friend f1 = new Friend("Dino");
        
        System.out.println(f1.name);
        System.out.println(Friend.numOfFriends);
        Friend f2 = new Friend("Rex");
        System.out.println(f2.name);
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
        
    }
}


class Friend {
    String name;
   static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;

    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
