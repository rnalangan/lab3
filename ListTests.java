import static org.junit.Assert.*;
import org.junit.*;

class StringChecker1 implements StringChecker {
    public boolean checkString(String s) {
        if (s.contains("Lab, code")) {
            return true;
        }
        return false;
    }

}
public class ListTests {

    @Test
    public void testfilter() {
        List <String> Original = new ArrayList <>(Arrays.asList ("CSE", "15L", "Lab", "code"));
        List <String> newList = new ArrayList <>(Arrays.asList ("Lab, code"));
        assertEquals(newList, filter(Original), filter());
      

    }

    @Test
    public void testmerge() {

    }
}
