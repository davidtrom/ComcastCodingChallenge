import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class WrapWordIterator {
    //private StringBuilder result = new StringBuilder();
    private StringBuilder result = new StringBuilder();
    private StringBuilder section = new StringBuilder();
    private StringBuilder lineSection = new StringBuilder();
    private Integer counter = 0;

    public String wrapFullWords(String str) {
        String[] stringWords = str.split(" ");
        ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(stringWords));
        for (int i = 0; i < wordsList.size() -1; i++) {
            String word = wordsList.get(i);
            word = word + " ";
            wordsList.set(i, word);
        }
        System.out.println(wordsList);
        ListIterator<String> wordsListIterator = wordsList.listIterator();

        while(wordsListIterator.hasNext()) {
            int nextWordLength = wordsListIterator.next().length();
        }
            System.out.println(section);
            if (wordsListIterator.nextIndex() == wordsList.size() -1) {
                result.append(wordsList);
                System.out.println("done");
            }
            while(section.length() + wordsListIterator.next().length() -1 < 13){
                result.append(wordsListIterator.next());
            }
            while (section.append(wordsListIterator.next()).length() - 1 <= 13) {
//                if (section.append(wordsListIterator.next()).length() - 1 < 13) {
                    section.append(wordsListIterator.next());
                    counter = counter + wordsListIterator.next().length();
//                }
            if (section.append(wordsListIterator.next()).length() - 1 == 13){
                    String withoutSpace = section.substring(0, section.length() - 2);
                    section.append(withoutSpace).append("\n");
                    section.setLength(0);
                }
            }
//        }




            //wordsListIterator = wordsListIterator.previous();
        System.out.println("result: " + result);
        return null;
    }
}
