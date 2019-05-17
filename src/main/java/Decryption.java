import java.util.Scanner;

public class Decryption {

    public String decryption(String input, int key) {


        StringBuilder decrypted = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypt = input.toLowerCase();


        //a for loop that runs through every character within the message
        for(int q = 0; q < encrypt.length(); q++)
        {
            int iIndex = alphabet.indexOf(encrypt.charAt(q));
            int dIndex = ((iIndex - key) + 26) % 26;

            decrypted.append(alphabet.charAt(dIndex));
        }

        return decrypted.toString();
    }

}
