import static org.junit.Assert.*;
import org.junit.Test;

public class EncryptionTest {
    @Test
    public void Encryption_lettershifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "c";
        assertEquals(expectedOutput, testEncryption.encryption("a", 2));
    }

    @Test
    public void Encryption_wordshifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "ecv";
        assertEquals(expectedOutput, testEncryption.encryption("cat",2));
    }

    @Test
    public void Encryption_sentenceshifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "lcxcrtqitcookpiowuvwpfgtuvcpf";
        assertEquals(expectedOutput, testEncryption.encryption("javaprogrammingmustunderstand", 2));
    }
}