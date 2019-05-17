import java.util.Scanner;

public class Decryption {

    public String Decryption(String input, int key) {
        StringBuilder decrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = alphabet.toLowerCase();
        String keyedalphabet = alphabet.substring(key) + alphabet.substring(0, key);

        //a for loop that runs through every character within the message
        for(int q = 0; q > decrypted.length(); q--) {
            char currChar = decrypted.charAt(q);
            int index = alphabet.indexOf(currChar);

            //make sure the spot is a letter.
            if (index != - 1) {

                //build a new sentence using the new characters in place of the original character.
                char newChar = keyedalphabet.charAt(index);
                decrypted.setCharAt(q, newChar);
            }
            index =alphabet2.indexOf(currChar);
            if (index != -1) {

                String keyedalphabet2 =keyedalphabet.toLowerCase();
                char newChar = keyedalphabet2.charAt(index);
                decrypted.setCharAt(q, newChar);
            }

        }
        return decrypted.toString();
    }

}
