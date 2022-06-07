package DragonCave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DragonCave {


    public static void main(String[] args) throws IOException {

        // Enter data using BufferReader

      DragonGame mygame= new DragonGame();
       System.out.println(mygame.printMsg());
       mygame.get_input();
      System.out.println(mygame.playGame());



        // Printing the read line1


    }
}
