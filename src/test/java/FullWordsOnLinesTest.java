import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FullWordsOnLinesTest {
    private FullWordsOnLines fullWordsOnLinesTest;
    String gettysburgAddress = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
    String riddle = "The quick brown fox jumped over the candle";
    String mice = "Many mumbling mice are making their music in the moonlight mighty nice, many mumbling mice";

    @BeforeEach
    void setUp() {
        fullWordsOnLinesTest = new FullWordsOnLines();

    }

    @Test
    void returnLines() {
        String expected = fullWordsOnLinesTest.returnFullWordLines(gettysburgAddress);
        Assertions.assertEquals(expected, "");
    }

    @Test
    void returnLines2() {
        String expected ="The quick" + "\n" + "brown fox" + "\n" + "jumped over" + "\n" + "the candle";
        Assertions.assertEquals(expected, fullWordsOnLinesTest.returnFullWordLines(riddle));
    }


}