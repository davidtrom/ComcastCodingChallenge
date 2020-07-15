import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApacheCommonsWordWrapTest {
    private ApacheCommonsWordWrap apacheCommonsWordWrapTest;
    String gettysburgAddress = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
    String riddle = "The quick brown fox jumped over the candle";
    String mice = "Many mumbling mice are making their music in the moonlight mighty nice, many mumbling mice";
    String grandmasHouse = "Over the river and through the woods to grandmother's house we go!";
    String twinkleStar = "Twinkle, twinkle, little star, how I wonder what you are! Up above the world so high, like a diamond in the sky.";

    @BeforeEach
    void setUp() {
        apacheCommonsWordWrapTest = new ApacheCommonsWordWrap();
    }

    @Test
    void apacheCommonsWrap() {
        String expected ="Four score" + "\r\n" + "and seven" + "\r\n" + "years ago our" + "\r\n" + "fathers" + "\r\n" + "brought forth" +
                "\r\n" + "upon this" + "\r\n" + "continent a" + "\r\n" + "new nation," + "\r\n" + "conceived in" + "\r\n" +
                "liberty and" + "\r\n" + "dedicated to" + "\r\n" + "the" + "\r\n" + "proposition" + "\r\n" + "that all men" + "\r\n" + "are created" +
                "\r\n" + "equal";
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap(gettysburgAddress));
    }

    @Test
    void wordWrapped2() {
        String expected ="Four score" + "\r\n" + "and seven" + "\r\n" + "years ago our" + "\r\n" + "fathers" + "\r\n" + "brought" +
                "\r\n" + "forth upon" + "\r\n" + "this" + "\r\n" + "continent a" + "\r\n" + "new nation," + "\r\n" + "conceived in" + "\r\n" +
                "liberty and" + "\r\n" + "dedicated to" + "\r\n" + "the" + "\r\n" + "proposition" + "\r\n" + "that all men" + "\r\n" + "are created" +
                "\r\n" + "equal";
        Assertions.assertNotEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap(gettysburgAddress));
    }

    @Test
    void apacheCommonsWrap3() {
        String expected ="The quick" + "\r\n" + "brown fox" + "\r\n" + "jumped over" + "\r\n" + "the candle";
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap(riddle));
    }

    @Test
    void wordWrapped4() {
        String expected ="Many mumbling" + "\r\n" + "mice are" + "\r\n" + "making their" + "\r\n" + "music in the" + "\r\n" + "moonlight" +
                "\r\n" + "mighty nice," + "\r\n" + "many mumbling" + "\r\n" + "mice";
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap(mice));
    }

    @Test
    void wordWrapped5() {
        String expected ="Four score" + "\n" + "and seven" + "\n" + "years ago our" + "\n" + "fathers" + "\n" + "brought forth" +
                "\n" + "upon this" + "\n" + "continent a" + "\n" + "new nation," + "\n" + "conceived in" + "\n" +
                "liberty and" + "\n" + "dedicated to" + "\n" + "the" + "\n" + "proposition" + "\n" + "that all men" + "\n" + "are created" +
                "\n" + "equal";
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap2(gettysburgAddress));
    }

    @Test
    void wordWrapped6() {
        String expected ="Over the" + "\n" + "river and" + "\n" + "through the" + "\n" + "woods to" + "\n" + "grandmother's" +
                "\n" + "house we go!";
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap2(grandmasHouse));
    }

    @Test
    void wordWrapped7() {
        String expected = "Twinkle," + "\n" + "twinkle," + "\n" + "little star," + "\n" + "how I wonder" + "\n" + "what you are!" +
                "\n" + "Up above the" + "\n" + "world so" + "\n" + "high, like a" + "\n" + "diamond in" + "\n" + "the sky." ;
        Assertions.assertEquals(expected, apacheCommonsWordWrapTest.apacheCommonsWrap2(twinkleStar));
    }
}