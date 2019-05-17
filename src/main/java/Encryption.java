import java.util.Scanner;


public class Encryption {


    //A Function that reads in a message and a key.
    public String encryption(String input, int key) {

        //identify the character within the sentence. Find a character's location within the alphabet.
        StringBuilder encrypted = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypt = input.toLowerCase();

        for (int q = 0; q < input.length(); q++)
        {
            int iIndex = alphabet.indexOf(encrypt.charAt(q));
            int eIndex = (iIndex + key) % 26;

            encrypted.append(alphabet.charAt(eIndex));

        }
        return encrypted.toString();
    }

}