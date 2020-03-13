import java.util.Scanner;

public class morse_code
{
    Scanner scan = new Scanner(System.in);

        char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //Morsecode representing all the letters and a space
        String[] morse = {"/", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        //Method to covert letters to morsecode
        public String letters_to_morseCode()
        {
            String input = scan.next().toLowerCase();
            char[] chars = input.toCharArray();
            StringBuilder str = new StringBuilder();

            for (char aChar : chars)
            {
                for (int i = 0; i < letters.length; i++)
                {
                    if (aChar == letters[i])
                    {
                        str.append(morse[i]);

                    }
                }

            }

            return str.toString();
        }

        //Method to covert letters to morsecode
        public String morseCode_to_letters()
        {
            String[] temp = {""};
            System.out.println("Please enter morse code: ");
            String input2 = scan.nextLine();
            StringBuilder ans = new StringBuilder();

            temp = input2.split(" ");

            for (String s : temp)
            {
                for (int j = 0; j < morse.length; j++)
                {
                    if (s.equals(morse[j]))
                    {

                        ans.append(letters[j]);
                    }

                }
            }
            return String.valueOf(ans);
        }
    }



