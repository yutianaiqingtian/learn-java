package offer.jianzhi.chapter05;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main41_1Test {

    @Test
    public void findNumberWithSum() {
        int[] arrays = {1, 2, 4, 7, 11, 15};
        int[] result = Main41_1.findNumberWithSum(arrays, 15);
        Assert.assertEquals("[4, 11]", Arrays.toString(result));
    }

    @Test
    public void FindNumbersWithSum() {
        int[] arrays = {1, 2, 4, 7, 11, 15};
        ArrayList<Integer> result = new Main41_1().FindNumbersWithSum(arrays, 15);
        Assert.assertEquals("[4, 11]", Arrays.toString(result.toArray()));
    }
}