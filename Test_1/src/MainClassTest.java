import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber()
    {
        int number = this.getLocalNumber(14);
        Assert.assertTrue("Test fail, number not equal 14", number == 14);
    }
}
