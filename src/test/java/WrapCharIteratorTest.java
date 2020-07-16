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
        String expected ="The quick" + "\n" + "brown fox" + "\n" + "jumped over" + "\n" + "the candle";
        Assertions.assertEquals(expected, wrapCharIteratorTest.wrapFullWords(riddle));
    }
}