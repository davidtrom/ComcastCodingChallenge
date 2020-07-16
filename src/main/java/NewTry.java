import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class NewTry {
    //private StringBuilder result = new StringBuilder();
    private String result = "";
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
            System.out.println(section);
            if (wordsListIterator.nextIndex() == wordsList.size() -1) {
                //section.append()
                System.out.println("done");
            }
//            while (section.append(wordsListIterator.next()).length() - 1 <= 13) {
                if (section.append(wordsListIterator.next()).length() - 1 < 13) {
                    section.append(wordsListIterator.next());
                } else if (section.append(wordsListIterator.next()).length() - 1 == 13){
                    String withoutSpace = section.substring(0, section.length() - 2);
                    section.append(withoutSpace);
                    section.setLength(0);
                }
            }
//        }


//            else if (section.append(wordsListIterator.next()).length() - 1 < 13) {
//                section.append(wordsListIterator.next());
//                result = section.toString();
//            }
//            else if (section.append(wordsListIterator.next()).length() - 1 == 13) {
//                    String withoutSpace = section.substring(0, section.length() - 2);
//                    section.append(withoutSpace);
//                    System.out.println("section in if " + section);
//                    result = section.toString();
//                    section.setLength(0);
//            }
//            else if (section.append(wordsListIterator.next()).length() - 1 > 13) {
//                section.setLength(0);
//                section.append(wordsListIterator.next());
//            }
//                //result = section.toString();
//            }



            //wordsListIterator = wordsListIterator.previous();
        System.out.println("result: " + result);
        return null;
    }
}
