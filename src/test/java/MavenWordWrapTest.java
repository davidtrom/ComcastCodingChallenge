import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MavenWordWrapTest {
    private MavenWordWrap mavenWordWrapTest;
    String gettysburgAddress = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
    String riddle = "The quick brown fox jumped over the candle";
    String mice = "Many mumbling mice are making their music in the moonlight mighty nice, many mumbling mice";

    @BeforeEach
    void setUp() {
        mavenWordWrapTest = new MavenWordWrap();
    }

    @Test
    void wordWrapped() {
        String expected ="Four score" + "\n" + "and seven" + "\n" + "years ago our" + "\n" + "fathers" + "\n" + "brought forth" +
                "\n" + "upon this" + "\n" + "continent a" + "\n" + "new nation," + "\n" + "conceived in" + "\n" +
                "liberty and" + "\n" + "dedicated to" + "\n" + "the" + "\n" + "proposition" + "\n" + "that all men" + "\n" + "are created" +
                "\n" + "equal";
        Assertions.assertEquals(expected, mavenWordWrapTest.mavenWordsWrapped(gettysburgAddress));
    }

    @Test
    void wordWrapped2() {
        String expected ="Four score" + "\n" + "and seven" + "\n" + "years ago our" + "\n" + "fathers" + "\n" + "brought" +
                "\n" + "forth upon" + "\n" + "this" + "\n" + "continent a" + "\n" + "new nation," + "\n" + "conceived in" + "\n" +
                "liberty and" + "\n" + "dedicated to" + "\n" + "the" + "\n" + "proposition" + "\n" + "that all men" + "\n" + "are created" +
                "\n" + "equal";
        Assertions.assertNotEquals(expected, mavenWordWrapTest.mavenWordsWrapped(gettysburgAddress));
    }

    @Test
    void apacheCommonsWrap3() {
        String expected ="The quick" + "\n" + "brown fox" + "\n" + "jumped over" + "\n" + "the candle";
        Assertions.assertEquals(expected, mavenWordWrapTest.mavenWordsWrapped(riddle));
    }

    @Test
    void apacheCommonsWrap4() {
        String expected ="Many mumbling" + "\n" + "mice are" + "\n" + "making their" + "\n" + "music in the" + "\n" + "moonlight" +
                "\n" + "mighty nice," + "\n" + "many mumbling" + "\n" + "mice";
        Assertions.assertEquals(expected, mavenWordWrapTest.mavenWordsWrapped(mice));
    }
}