import Lesson6.MainClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrCut_test {

    MainClass mainClass;

    @Before
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void test1_OK() {
        int[] arr = {1,3,4,8,7,4,8,9};
        int[] expected = {8,9};
        Assert.assertArrayEquals(expected, mainClass.arrCut(arr));
    }

    @Test
    public void test2_OK() {
        int[] arr = {4,3,41,8,7,5,8};
        int[] expected = {3,41,8,7,5,8};
        Assert.assertArrayEquals(expected, mainClass.arrCut(arr));
    }

    @Test
    public void test3_OK() {
        int[] arr = {1,3,4,8,7,4,8,4};
        int[] expected = {};
        Assert.assertArrayEquals(expected, mainClass.arrCut(arr));
    }

    @Test(expected = NullPointerException.class)
    public void contain_null() {
        int[] arr = null;
        mainClass.arrCut(arr);
    }

    @Test(expected = RuntimeException.class)
    public void not_contain_4() {
        int[] arr = {2,3,41,8,7,5,8,2};
        mainClass.arrCut(arr);
    }

}
