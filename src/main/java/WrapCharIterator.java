import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class WrapCharIterator {
    private StringBuilder result = new StringBuilder();
    private StringBuilder section = new StringBuilder();
    private StringBuilder lineSection = new StringBuilder();
    private Integer counter = 0;

    public String wrapFullWords(String str) {
        String[] stringCharacters = str.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(stringCharacters));
        ListIterator<String> strListIterator = strList.listIterator();

        while (strListIterator.hasNext()) {
            if(section.length() < 13) {
                section.append(strListIterator.next());
                if(section.length() == 13 && !strListIterator.next().equals(" ") && !strListIterator.previous().equals("  ")){
                    String onlyFullWords = section.substring(0,section.lastIndexOf(" "));
                }
            }
            counter++;
            if (counter == 14 && section.charAt(13) == ' ') {
                result = section;
                counter = 0;
                System.out.println(section);
                System.out.println("in if block result: " + result);
                section.setLength(0);
            } else {
                int endOfFullWords = section.lastIndexOf(" ");
                //String sectionToAdd = section.substring(0, endOfFullWords);
//                result.append(sectionToAdd);
                System.out.println("in else block section: " + section);
                System.out.println("in else block result: " + result);
                section.setLength(0);
            }
        }
//            if(section.length())
//
//            for (int i = 0; i < strList.size(); i++) {
//                for (int j = 0; j < i+13; j++) {
//                    String s = strSplit[j];
//
//                }
//                String s = strSplit[i];
//
//            }
//        }
//        for (int i = 0; i < strSplit.length; i++) {
//
//            while (lineLength < 13){
//                lineLength = strSplit[i].length() + strSplit[i+1].length();
//            }
//            lineSection =
//            if lineLength
//            String s = strSplit[i];

//        }
        return null;
//    }
    }
}
