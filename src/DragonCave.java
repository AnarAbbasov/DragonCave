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
        String response="";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            // Reading data using readLine
             response = reader.readLine();
        } catch (Exception e)
        {
            System.out.println("Exception caught");
        }
        // Printing the read line1
        if (response.compareTo("1")==0)
        {
            System.out.println("You approach cave.." +
                    "Its dark and spooky..."+"A large dragon jumps out in front of ou ! He opens his jaws and .." +
                    "Gobbles you down in one bite!"
            );

        } else if (response.compareTo("2")==0)
        { System.out.println("Good"); }

    }
}
