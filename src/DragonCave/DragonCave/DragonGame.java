package DragonCave;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DragonGame
{
    String response="";
   public  String printMsg ()
    {

        return ("You are in a land full of dragons in front of you," +
                "you see two caves.In one cave ,the dragon is friendly" +
                "and will share is treasure with you.The other dragon is greedy and hungry" + "\n"+
                "and will eat you on sight " + "\n"+ " Which cave will you go ito? (1 or 2)?");
    }

  public  String get_input()
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            // Reading data using readLine
            response=reader.readLine();
            return response;
        }   catch (Exception e)
        {
            return("Exception caught");
        }


    }

  public   String playGame()
    {
        if (response.compareTo("1")==0)
        {
            return ("You approach cave.." +
                    "Its dark and spooky..."+"A large dragon jumps out in front of ou ! He opens his jaws and .." +
                    "Gobbles you down in one bite!"
            );

        } else if (response.compareTo("2")==0)
        { return("Good"); }
        return "";
    }
}