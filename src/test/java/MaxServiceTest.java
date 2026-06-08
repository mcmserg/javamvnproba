import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;



public class MaxServiceTest {

    @Test
    public  void  shouldFinMax() {
        MaxService service = new MaxService();

        long a = 5;
        long b = 3;

        long expected = 5;
        long actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);

    }

}
