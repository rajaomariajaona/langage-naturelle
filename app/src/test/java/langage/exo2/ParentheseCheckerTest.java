package langage.exo2;

import langage.exo2.ParentheseChecker;
import org.junit.Test;
import static org.junit.Assert.*;
public class ParentheseCheckerTest {
    @Test public void testParenthese(){
        assertTrue("((({)))", ParentheseChecker.check("(<<>>)"));
    }
}
