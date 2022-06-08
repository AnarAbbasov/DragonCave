package DragonCave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DragonCave {


    public static void main(String[] args) throws IOException {

        // Enter data using BufferReader

      DragonGame mygame= new DragonGame();
       System.out.println(mygame.printMsg());
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        String  response=reader.readLine();
        mygame.get_input(response);

       mygame.get_input(response);
      System.out.println(mygame.playGame());






    }
}
