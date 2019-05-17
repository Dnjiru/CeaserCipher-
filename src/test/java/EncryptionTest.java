import static org.junit.Assert.*;
import org.junit.Test;

public class EncryptionTest {
    @Test
    public void Encryption_lettershifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "c";
        assertEquals(expectedOutput, testEncryption.Encryption("a", 2));
    }

    @Test
    public void Encryption_wordshifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "ecv";
        assertEquals(expectedOutput, testEncryption.Encryption("cat",2));
    }

    @Test
    public void Encryption_sentenceshifted_String() {
        Encryption testEncryption = new Encryption();
        String expectedOutput = "lcxc rtqitcookpi owuv wpfgtuvcpf";
        assertEquals(expectedOutput, testEncryption.Encryption("java programming must understand", 2));
    }
}