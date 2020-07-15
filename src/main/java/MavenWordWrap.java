import org.davidmoten.text.utils.WordWrap;

public class MavenWordWrap {

    public String mavenWordsWrapped (String str){
        String result = WordWrap.from(str)
                .maxWidth(13)
                .insertHyphens(false)
                .wrap();

        System.out.println(result);
        return result;
    }
}
