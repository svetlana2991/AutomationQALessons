import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        int number = this.getLocalNumber(14);
        Assert.assertTrue("Test fail, number not equal 14", number == 14);
    }

    @Test
    public void testGetClassNumber(){
        int classNumber = this.getClassNumber();
        Assert.assertTrue("Test fail: classNumber less then 45",classNumber > 45);
    }

    @Test
    public void testGetClassString(){
        String substring = this.getClass_string();

        if (substring.indexOf("Hello") >= 0){
            //System.out.println("Hello");
        }
        else if(substring.indexOf("hello") >= 0){
            //System.out.println("hello");
        }
        else{
            Assert.fail("Can not find substrings 'Hello' or 'hello' in class_string.");
        }
    }
}

