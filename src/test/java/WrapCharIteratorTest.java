import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapCharIteratorTest {
    private WrapCharIterator wrapCharIteratorTest;
    private String gettysburgAddress = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
    private String riddle = "The quick brown fox jumped over the candle quickly";
    private String mice = "Many mumbling mice are making their music in the moonlight mighty nice, many mumbling mice";

    @BeforeEach
    void setUp() {
        wrapCharIteratorTest = new WrapCharIterator();
    }

    @Test
    void wrapFullWords() {
        String expected ="The quick" + "\n" + "brown fox" + "\n" + "jumped over" + "\n" + "the candle" + "\n" + "quickly";
        Assertions.assertEquals(expected, wrapCharIteratorTest.wrapFullWords(riddle));
    }

    @Test
    void wordWrapped2() {
        String expected ="Four score" + "\n" + "and seven" + "\n" + "years ago our" + "\n" + "fathers" + "\n" + "brought" +
                "\n" + "forth upon" + "\n" + "this" + "\n" + "continent a" + "\n" + "new nation," + "\n" + "conceived in" + "\n" +
                "liberty and" + "\n" + "dedicated to" + "\n" + "the" + "\n" + "proposition" + "\n" + "that all men" + "\n" + "are created" +
                "\n" + "equal";
        Assertions.assertNotEquals(expected, wrapCharIteratorTest.wrapFullWords(gettysburgAddress));
    }

    @Test
    void apacheCommonsWrap3() {
        String expected ="Many mumbling" + "\n" + "mice are" + "\n" + "making their" + "\n" + "music in the" + "\n" + "moonlight" +
                "\n" + "mighty nice," + "\n" + "many mumbling" + "\n" + "mice";
        Assertions.assertEquals(expected, wrapCharIteratorTest.wrapFullWords(mice));
    }
}