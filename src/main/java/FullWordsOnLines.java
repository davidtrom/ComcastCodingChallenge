public class FullWordsOnLines {

    public String returnFullWordLines (String str) {
        StringBuilder result = new StringBuilder();
        String section = "";
        int startIndex = 0;
        int endIndex = 12;
//        for (int i = 0; i < str.length(); i+=13) {
//        while(endIndex < str.length()){
           //




           //i < endIndex; ?
            //section = newSection(str, 0, 13);
//            System.out.println("section " + section);
//            runningTotalOfIndex = runningTotalOfIndex + 13;
//            if (section.charAt(section.length() - 1) == ' ') {
//                result.append(section);
//                System.out.println("result " + result.toString());
//            }
//        }



        return result.toString();
    }

    public String newSection (String str, int startIndex, int endIndex){
        String section = str.substring(startIndex, endIndex);
        int endOfWords = section.lastIndexOf(' ');
        String fullWordsLine = section.substring(startIndex, endOfWords);
        result.append(fullWordsLine);
        startIndex = result.length();
        endIndex = startIndex + 13;
        System.out.println(result.toString());
        return str.substring(startIndex, endIndex);
    }


}
