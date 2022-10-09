import java.util.ArrayList;
import java.util.HashMap;

public class Word {

    /*
     * The method converts an ArrayList with a set of words into HashMap with lowercase words as keys
     * and the number of words as values.
     * At the end of the method. a list of unique words and words with their number are printed.
     */
    public void count(ArrayList<String> words) {
        HashMap<String, Integer> uniqueWord = new HashMap<>();
        Integer i = 0;
        for (String wordItem : words) {
            if (uniqueWord.get(wordItem.toLowerCase()) != null) {
                i = uniqueWord.get(wordItem.toLowerCase()) + 1;
                uniqueWord.put(wordItem.toLowerCase(), i);
            } else
                uniqueWord.put(wordItem.toLowerCase(), 1);
        }
        printUniqueWords(uniqueWord);
        printCountUniqueWord(uniqueWord);
    }

    public void printUniqueWords(HashMap<String, Integer> mapForPrint) {
        System.out.print("[");
        mapForPrint.keySet().stream().forEach(item -> System.out.print(item + " "));
        System.out.print("] \n");
    }

    public void printCountUniqueWord(HashMap<String, Integer> mapForPrint) {
        mapForPrint.keySet().stream().forEach(item -> System.out.println(item + "->" + mapForPrint.get(item)));
    }
}
