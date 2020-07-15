public class FullWordsOnLines {
    private StringBuilder result = new StringBuilder();
    private String section = "";
    private int startIndex = 0;
    private int endIndex = 13;
    private int runningTotal;


    public String returnFullWordLines (String str) {

//        for (int i = 0; i < str.length(); i+=13) {
        while(endIndex < str.length()){
            String mySection = str.substring(startIndex, endIndex);
            System.out.println("section: " + mySection);
            int endOfWords = mySection.lastIndexOf(' ');
            runningTotal += endOfWords;
            System.out.println(("running Total: " + runningTotal));
            String fullWordsLine = mySection.substring(startIndex, endOfWords);
            //result.append(fullWordsLine);
            //startIndex = startIndex + endOfWords + 1;
            startIndex = startIndex + 13;
            System.out.println("starting index: " + startIndex);
            endIndex = startIndex + 13;
            System.out.println("end Index: " + endIndex);
           //System.out.println("result: " + result.toString());
           if(endIndex > str.length()){
               System.out.println("Update this");
           }
        }

        return result.toString();
    }

//    public String newSection (String str, int startIndex, int endIndex){
//        String mySection = str.substring(startIndex, endIndex);
//        int endOfWords = mySection.lastIndexOf(' ');
//        String fullWordsLine = mySection.substring(startIndex, endOfWords);
//        result.append(fullWordsLine);
//        startIndex = endOfWords + 1;
//        endIndex = startIndex + 13;
//        System.out.println(result.toString());
//        //return str.substring(startIndex, endIndex);
//    }


}
