import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    public void testSum() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        assertEquals(10, ArrayListUtils.sum(arr), "sum should be 10");
    }

}
