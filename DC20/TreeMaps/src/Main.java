import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Create Example Book Instances
        Book b1 = new Book(1001,"You don't know JS", "Kyle Simpson", "O'Reilly Media", 55.95);
        Book b2 = new Book(1002, "The Code Book","Simon Lehna Singh", "Fourth Estate", 15.30);
        Book b3 = new Book(1003, "Thing Explainer", "Randall Munroe", "Houghton Mifflin Harcourt", 24.95);
        Book b4 = new Book(1004, "A Brief History Of Time", "Stephen Hawking", "Bantam Books", 40.74);
        Book b5 = new Book(1005, "Don't Make Me Think", "Steve Krug", "New Riders Press",37.73);
        Book b6 = new Book(1006, "A non-existent title", "Naught Reel", "Pheik Media", 13.37);
        Book b7 = new Book(1007, "The Art of Game Design", "Jesse Schell", "CRC Press", 24.31);

        //Creating Treemap and inserting samples
        NavigableMap<Integer,Book> map = new TreeMap<Integer, Book>();
        map.put(1001,b1);
        map.put(1002,b2);
        map.put(1003,b3);
        map.put(1004,b4);
        map.put(1005,b5);
        map.put(1006,b6);
        map.put(1007,b7);

        //Descending Map - Gives keys in reverse order they were put in
        System.out.println("Descending Map: " + map.descendingMap() + "\n");

        //Head Map - Gives all values up to the specified map.
        System.out.println("Head Map: " + map.headMap(1005,true) + "\n");

        //Tail Map - Gives all values after the specified map.
        System.out.println("Tail Map: " + map.tailMap(1003,true) + "\n");

        //Sub Map - Gives all values between the specified maps.
        System.out.println("Sub Map: " + map.subMap(1003,false,1006,true) + "\n");

        //First and last entry gives the first and last values in the map respectively
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());


        //Can be used similarly to arrays/arraylists to get specific values in each.
        System.out.println(map.get(1005).getName());

        for(int i = 0; i < map.size(); i++){
            Book b = map.get(1001 + i);
            System.out.println("Book " + b.getID() + ": '" + b.getName() + "' by " + b.getAuthor() + "| USD Price: " + b.getPrice());
        }
    }
}
