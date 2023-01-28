import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests implements StringChecker {

    public boolean checkString(String s) {
        if (s.contains("e")) {
            return true;
        } else {
            return false;
        }
    }
    @Test
    public void filterTests() {
        List<String> stringList = new ArrayList<String>(Arrays.asList("Hello", 
                                                        "Hey Buddy","Goodbye"));
        ListTests lt = new ListTests();
        List<String> filteredList = ListExamples.filter(stringList, lt);


    }
    
}
