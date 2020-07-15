import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApacheCommonsWordWrapTest {
    private ApacheCommonsWordWrap apacheCommonsWordWrapTest;
    String gettysburgAddress = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
    String riddle = "The quick brown fox jumped over the candle";
    String mice = "Many mumbling mice are making their music in the moonlight mighty nice, many mumbling mice";

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
}