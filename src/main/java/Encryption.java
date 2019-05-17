import java.util.Scanner;


public class Encryption {


    //A Function that reads in a message and a key.
    public String Encryption(String input, int key) {

        //identify the character within the sentence. Find a character's location within the alphabet.
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = alphabet.toLowerCase();
        String keyedalphabet = alphabet.substring(key) +
                alphabet.substring(0, key);

        //a for loop that runs through every character within the message
        for (int q = 0; q < encrypted.length(); q++) {
            char currChar = encrypted.charAt(q);
            int index = alphabet.indexOf(currChar);

            //make sure the spot is a letter.
            if (index != -1) {

               //build a new sentence using the new characters in place of the original character.
                char newChar = keyedalphabet.charAt(index);
                encrypted.setCharAt(q, newChar);
            }
            index = alphabet2.indexOf(currChar);
            if (index != -1) {

                String keyedalaphabet2 =
                        keyedalphabet.toLowerCase();
                char newChar = keyedalaphabet2.charAt(index);
                encrypted.setCharAt(q, newChar);
            }
        }
        return encrypted.toString();

    }
}


