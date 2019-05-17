
import java.io.Console;

public class App {
    public static  void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter the Message to be Encrypted");

        String stringInput = myConsole.readLine();

        System.out.println("Enter a shift Key");
        String stringKey = myConsole.readLine();
        int intKey = Integer.parseInt(stringKey);

        Encryption testEncryption = new Encryption();
        String encrypted = testEncryption.Encryption(stringInput,intKey);

        System.out.println("Your Encryption is... " +  encrypted);

    }

}
