import java.util.Scanner;

public class SearchInArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] epstin_files ={
    "Donald Trump",
    "Bill Clinton",
    "Prince Andrew",
    "Alan Dershowitz",
    "Leon Black",
    "Les Wexner",
    "Ehud Barak",
    "George Mitchell",
    "Glenn Dubin",
    "Tom Pritzker",
    "Jean-Luc Brunel",
    "Ghislaine Maxwell",
    "Virginia Giuffre",
    "Sarah Ferguson",
    "Naomi Campbell",
    "Kevin Spacey",
    "Chris Tucker",
    "Courtney Love",
    "Larry Summers",
    "Woody Allen",
    "Stephen Hawking",
    "Peter Soros",
    "Marvin Minsky",
    "Jes Staley",
    "Mark Epstein",
    "Andrés Pastrana",
    "John Glenn",
    "Richard Branson",
    "Mort Zuckerman",
    "David Copperfield",
    "Michael Jackson",
    "Mick Jagger",
    "Ralph Fiennes",
    "Liz Hurley",
    "Ivana Trump",
    "Chelsea Clinton",
    "Robert F. Kennedy Jr.",
    "Katie Couric",
    "George Stephanopoulos",
    "Charlie Rose",
    "Anderson Cooper",
    "Alec Baldwin",
    "Bruce Willis",
    "Sylvester Stallone",
    "Dustin Hoffman",
    "Mel Gibson",
    "Ben Affleck",
    "Matt Damon",
    "Leonardo DiCaprio",
    "Orlando Bloom",
    "Cate Blanchett",
    "Uma Thurman",
    "Heidi Klum",
    "Claudia Schiffer",
    "Christy Turlington",
    "Carla Bruni",
    "Eva Herzigova",
    "Tyra Banks",
    "Sheryl Crow",
    "Sting",
    "Bono",
    "Phil Collins",
    "Eric Clapton",
    "David Bowie",
    "Elton John",
    "Paul McCartney",
    "Ringo Starr",
    "George Harrison",
    "Mick Fleetwood",
    "Stevie Nicks",
    "Tom Hanks",
    "Steven Spielberg",
    "Quentin Tarantino",
    "Martin Scorsese",
    "James Cameron",
    "Ridley Scott",
    "Roman Polanski",
    "Harvey Weinstein",
    "Peter Soros",
    "Richard Feynman",
    "Lawrence Krauss",
    "Marvin Minsky",
    "Stephen Hawking",
    "Michio Kaku",
    "Brian Greene",
    "Richard Dawkins",
    "Deepak Chopra",
    "Oprah Winfrey",
    "Barbara Walters",
    "Diane Sawyer",
    "Anderson Cooper",
    "Larry King",
    "Jon Stewart",
    "Bill Maher",
    "Jimmy Fallon",
    "Jay Leno",
    "David Letterman",
    "Conan O’Brien",
    "Ellen DeGeneres",
    "Rosie O’Donnell",
    "Whoopi Goldberg"
    };

    System.out.print("Enter the person name you want to search:");
    String name =scanner.nextLine();
    name = name.toLowerCase();

    boolean found = false;


    for(int i = 0; i<epstin_files.length; i++){
        if(name.equals(epstin_files[i].toLowerCase())){
            found = true;
            break;
        }
    }
    if(found){
        System.out.println(name + " is in Epstin files!");
    }
    else{
        System.out.println(name + " is not in Epstin files!");
    }
        
    
    scanner.close();

}}