import org.apache.commons.text.WordUtils;

public class ApacheCommonsWordWrap {

    public String apacheCommonsWrap (String str){
        String result = WordUtils.wrap(str, 13);
        System.out.println(result);
        return result;
    }
}

/*

        When running this unit test, I found that I got an error that mentioned "Contents have differences only in line separators.  Expected LF, Actual CRLF."
        Upon further investigation I found the following information.  Instead of using \n in my expected statement, I needed to change it to
        \r\n in order for the test to work correctly.
        \r = CR (Carriage Return) → Used as a new line character in Mac OS before X
        \n = LF (Line Feed) → Used as a new line character in Unix/Mac OS X
        \r\n = CR + LF → Used as a new line character in Windows

 */
