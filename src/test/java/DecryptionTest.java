import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptionTest {

    @Test
    public void Decryption_lettershifted_String() {
        Decryption testDecryption = new Decryption();
        String expectedOutput = "a";
        assertEquals(expectedOutput, testDecryption.decryption("c", 2));
    }

    @Test
    public void Decryption_wordshifted_String() {
        Decryption testDecryption = new Decryption();
        String expectedOutput = "cat";
        assertEquals(expectedOutput, testDecryption.decryption("ecv", 2));
    }

    @Test
    public void Decryption_sentenceshifted_String() {
        Decryption testDecryption = new Decryption();
        String expectedOutput = "javaprogrammingmustunderstand";
        assertEquals(expectedOutput, testDecryption.decryption("lcxcrtqitcookpiowuvwpfgtuvcpf", 2));
    }



}