import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DragonCave {


    public static void main(String[] args) throws IOException {
        System.out.println("You are in a land full of dragons in front of you," +
                "you see two caves.In one cave ,the dragon is friendly" +
                "and will share is treasure with you.The other dragon is greedy and hungry" +
                "and will eat you on sight ");
        System.out.println("Which cave will you go ito? (1 or 2)? ");
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}
