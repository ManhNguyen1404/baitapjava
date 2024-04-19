import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaitaptrenlopTest {

    @Test
    public void testAdd_PositiveNumbers() {
        Baitaptrenlop baitap = new Baitaptrenlop();
        int result = baitap.add(2, 3);
        assertEquals(5, result, "Expected result should be 5 when adding 2 and 3");
    }

    @Test
    public void testAdd_NegativeNumbers() {
        Baitaptrenlop baitap = new Baitaptrenlop();
        int result = baitap.add(-2, -3);
        assertEquals(-5, result, "Expected result should be -5 when adding -2 and -3");
    }

    @Test
    public void testAdd_PositiveAndNegativeNumbers() {
        Baitaptrenlop baitap = new Baitaptrenlop();
        int result = baitap.add(-2, 3);
        assertEquals(1, result, "Expected result should be 1 when adding -2 and 3");
    }
}
