import java.util.Scanner;

public class LeetspeakTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt = scanner.nextLine();
        txt = txt.toUpperCase();

        char[] letter = txt.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            switch (letter[i]) {
                case 'A' -> letter[i] = '@';
                case 'B' -> letter[i] = '8';
                case 'C' -> letter[i] = '(';
                case 'E' -> letter[i] = '3';
                case 'G' -> letter[i] = '6';
                case 'H' -> letter[i] = '#';
                case 'I' -> letter[i] = '!';
                case 'L' -> letter[i] = '1';
                case 'O' -> letter[i] = '0';
                case 'S' -> letter[i] = '$';
                case 'T' -> letter[i] = '7';
                case 'Z' -> letter[i] = '2';
            }
        }
        txt = new String(letter);
        System.out.println(txt);
    }
}
