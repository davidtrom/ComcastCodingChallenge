//THIS SEEMS TO WORK IN AT LEAST SOME CASES.  I HAVEN'T BEEN ABLE TO GET THE TIME TO TEST IT PROPERLY TO SEE WHERE
// IT MIGHT NEED JUST A LITTLE MORE TWEAKING.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class WrapCharIterator {

    public String wrapFullWords(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder section = new StringBuilder();
        String[] stringCharacters = str.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(stringCharacters));
        ListIterator<String> strListIterator = strList.listIterator();

        while (strListIterator.hasNext()) {
            if(section.length() < 13) {
                section.append(strListIterator.next());
                if(strListIterator.nextIndex() == str.length() -1) {
                    result.append(section);
                    result.append(strListIterator.next());
                }
                else if(section.length() == 13 && ((!strListIterator.next().equals(" ") && !strListIterator.previous().equals(" ")) || (strListIterator.previous().equals(" ") && !strListIterator.next().equals(" ")))){
                    String onlyFullWords = section.substring(0, section.lastIndexOf(" "));
                    String newBeginning = section.substring(section.lastIndexOf(" ") + 1);
                    result.append(onlyFullWords).append("\n");
                    section.setLength(0);
                    section.append(newBeginning);
                }
                else if (section.length() == 13 && ((!strListIterator.next().equals(" ") && strListIterator.previous().equals(" ")) || (strListIterator.next().equals(" ") && strListIterator.previous().equals(" ")))){
                    result.append(section).append("\n");
//                    String onlyFullWords = section.substring(0, section.lastIndexOf(" "));
//                    String newBeginning = section.substring(section.lastIndexOf(" ") + 1);
//                    result.append(onlyFullWords).append("\n");
                    section.setLength(0);
                    //section.append(newBeginning);
                }

//                else if(section.length() == 13 && !strListIterator.previous().equals(" ")){
//            }
            }
        }
        System.out.println(result);
        return result.toString();
//    }
    }
}
