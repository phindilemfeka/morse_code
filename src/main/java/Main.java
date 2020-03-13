import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        morse_code MorseCodeObj = new morse_code();

        System.out.println("Welcome! Please enter 1 for letters_to_morsecode or 2 for morsecode_to_letters.");
        String option = scan.nextLine();

        switch (option)
        {
            case "1":
                System.out.println(MorseCodeObj.letters_to_morseCode());
                break;
            case "2":
                System.out.println( MorseCodeObj.morseCode_to_letters());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
