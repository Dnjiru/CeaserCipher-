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
}