import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class testMean {
    @Test
    public void testMean(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(3);
        assertEquals(3, ArrayListUtils.mean(arr), "mean should be 3");
    }
}
