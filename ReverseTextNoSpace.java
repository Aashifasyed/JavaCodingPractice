import java.util.Scanner;
public class ReverseTextNoSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a line of text:");
        String input = sc.nextLine();
        sc.close();
        String[] words = input.trim().split("\\s+");
        StringBuilder reversedText = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]);
            if (i > 0) {
                reversedText.append(" ");
            }
        }
        System.out.println(reversedText.toString());
    }
}
