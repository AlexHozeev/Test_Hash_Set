
import java.util.HashSet;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
//        Cup goldencup = new Cup("Gold", 100);
//
//        HashSet<Cup> cups = new HashSet<>();
//        cups.add(new Cup("Red",12));
//        cups.add(new Cup("Blue",14));
//        cups.add(new Cup("Red",5));
//        cups.add(goldencup);
//        System.out.println(cups);


        TreeSet<Cup> cups = new TreeSet<>((f,s) -> f.getColor().compareTo(s.getColor()));
        cups.add(new Cup("Red", 12));
        cups.add(new Cup("Blue", 14));
        cups.add(new Cup("Red", 5));
        System.out.println(cups);
    }
}
