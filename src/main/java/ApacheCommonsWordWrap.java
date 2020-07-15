import org.apache.commons.text.WordUtils;

public class ApacheCommonsWordWrap {

    public String apacheCommonsWrap (String str){
        String result = WordUtils.wrap(str, 13);
        System.out.println(result);
        return result;
    }

    public String apacheCommonsWrap2 (String str){
        String result = WordUtils.wrap(str, 13, "\n", false);
        System.out.println(result);
        return result;
    }
}

