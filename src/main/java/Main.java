import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Word task1 = new Word();
        ReferencePhoneTool task2 = new ReferencePhoneTool();

        // ----------------task 1--------------------
        ArrayList<String> listOfWord = new ArrayList<>();
        listOfWord.add("Когда-нибудь");
        listOfWord.add("я");
        listOfWord.add("отыщу");
        listOfWord.add("овтет");
        listOfWord.add("Когда-нибудь");
        listOfWord.add("мне");
        listOfWord.add("станет");
        listOfWord.add("цель");
        listOfWord.add("ясна");
        listOfWord.add("Какая-нибудь");
        listOfWord.add("сотая");
        listOfWord.add("весна");
        listOfWord.add("откроет");
        listOfWord.add("мне");
        listOfWord.add("потусторонний");
        listOfWord.add("свет");
        listOfWord.add("и");
        listOfWord.add("я");
        listOfWord.add("постигну");
        listOfWord.add("смысл");
        listOfWord.add("бытия");
        listOfWord.add("сумев");
        listOfWord.add("земную");
        listOfWord.add("бренность");
        listOfWord.add("превозмочь");

        task1.count(listOfWord);

        // ----------------task 2--------------------
        task2.add("Ivanov", "+11 (12) 1234567");
        task2.add("Vasechkin", "+22 (34) 1122334");
        task2.add("Petrov", "+11 (11) 1111111");
        task2.add("Vasechkin", "+22 (22) 2222222");
        task2.add("Startseva", "+11 (12) 7654321");
        task2.add("Sidorov", "+11 (12) 9988765");
        task2.add("Startseva", "+11 (12) 9998887");

        System.out.println();
        System.out.println("Petrov: " + task2.get("Petrov"));
        System.out.println("Vasechkin: " +task2.get("Vasechkin"));
        System.out.println("Startseva: " +task2.get("Startseva"));
    }
}
