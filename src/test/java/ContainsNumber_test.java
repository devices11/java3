import Lesson6.MainClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsNumber_test {
    MainClass mainClass;

    @Before
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void contain_1_and_4() {
        int[] arr = {1,3,4,8,7,4,8,9};
        Assert.assertTrue(mainClass.containsNumber(arr));
    }

    @Test
    public void contain_1() {
        int[] arr = {1,3,12,8,7,2,8,9};
        Assert.assertTrue(mainClass.containsNumber(arr));
    }

    @Test
    public void contain_4() {
        int[] arr = {22,3,2,8,7,2,8,4};
        Assert.assertTrue(mainClass.containsNumber(arr));
    }

    @Test()
    public void not_contain_1_or_4() {
        int[] arr = {11,3,44,8,7,5,8,2};
        Assert.assertFalse(mainClass.containsNumber(arr));
    }

    @Test(expected = NullPointerException.class)
    public void contain_null() {
        int[] arr = null;
        mainClass.containsNumber(arr);
    }

    @Test()
    public void contain_empty() {
        int[] arr = {};
        Assert.assertFalse(mainClass.containsNumber(arr));
    }

}
