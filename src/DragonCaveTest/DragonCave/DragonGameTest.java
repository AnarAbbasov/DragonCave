package DragonCave;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonGameTest {
    DragonGame mygame=new DragonGame();
    @BeforeEach
    void setUp() {
        mygame.response="1";

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printMsg() {
        assertEquals("You are in a land full of dragons in front of you,you see two caves.In one cave ,the dragon is friendlyand will share is treasure with you.The other dragon is greedy and hungry\n" +
                "and will eat you on sight \n" +
                " Which cave will you go ito? (1 or 2)?", mygame.printMsg());
    }

    @Test
    void get_input() {
        mygame.response="1";
        assertEquals("1", mygame.get_input(mygame.response));

    }

    @Test
    void playGame() {
        assertEquals("You approach cave..Its dark and spooky...A large dragon jumps out in front of ou ! He opens his jaws and ..Gobbles you down in one bite!", mygame.playGame());
    }
    @Test
    void setUp2() {
        mygame.response="2";

    }

    @Test
    void playGame2() {
        mygame.response="2";
        assertEquals("Good", mygame.playGame());
    }
}