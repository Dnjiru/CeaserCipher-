import java.io.Console;

public class App {
    public static  void main(String[] args) {
        Console myConsole = System.console();
        Encryption code = new Encryption();
        Decryption code1 = new Decryption();

        System.out.println("Enter the Message to be Encrypted");
        String stringInput = myConsole.readLine();

        System.out.println("Enter a shift Key");
        int key = Integer.parseInt(myConsole.readLine());

        String encode = code.encryption(stringInput, key);

        System.out.println("Your Input is... " + stringInput);
        System.out.println("Your Encryption is... " + encode);
        System.out.println("Your Decryption is... " + code1.decryption(encode, key));

    }
}
