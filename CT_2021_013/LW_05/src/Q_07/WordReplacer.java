package Q_07;
import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the replacement word: ");
        String newWord = sc.next();
        String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        System.out.println("Result: " + result);
        sc.close();
    }
}
