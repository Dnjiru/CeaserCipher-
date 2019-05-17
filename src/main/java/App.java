
import java.io.Console;

public class App {
//    public static  void main(String[] args) {
//        Console myConsole = System.console();
//        System.out.println("Enter the Message to be Encrypted");
//
//        String stringInput = myConsole.readLine();
//
//        System.out.println("Enter a shift Key");
//        String stringKey = myConsole.readLine();
//        int intKey = Integer.parseInt(stringKey);
//
//        Encryption testEncryption = new Encryption();
//        String encrypted = testEncryption.Encryption(stringInput,intKey);
//
//        System.out.println("Your Encryption is... " +  encrypted);
//
//    }

    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter message to be Decrypted");

        String stringInput = myConsole.readLine();

        System.out.println("Enter the Shift Key");
        String stringKey = myConsole.readLine();
        int intKey = Integer.parseInt(stringKey);

        Decryption testDecryption = new Decryption();
        String decrypted = testDecryption.Decryption(stringInput, intKey);

        System.out.println("Your Decryption is ... " + decrypted);
    }

}
