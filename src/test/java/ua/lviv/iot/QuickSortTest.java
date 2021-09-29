package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort_Input(){
        int[] input = {6, 15, 1, 36, -3, 56, 3};
        int[] result = {-3, 1, 3, 6, 15, 36, 56};
        Assert.assertArrayEquals(result, Transformer.quick_sort(input, "asc", 0, input.length-1));
    }

    @Test
    public void testQuickSort_AscToAsc(){
        int[] input = {-3, 1, 3, 6, 15, 36, 56};
        int[] result = {-3, 1, 3, 6, 15, 36, 56};
        Assert.assertArrayEquals(result, Transformer.quick_sort(input, "asc", 0, input.length-1));
    }

    @Test
    public void testQuickSort_AscToDesc(){
        int[] input = {-3, 1, 3, 6, 15, 36, 56};
        int[] result = {56, 36, 15, 6, 3, 1, -3};
        Assert.assertArrayEquals(result, Transformer.quick_sort(input, "desc", 0, input.length-1));
    }

    @Test
    public void testQuickSort_DescToDesc(){
        int[] input = {56, 36, 15, 6, 3, 1, -3};
        int[] result = {56, 36, 15, 6, 3, 1, -3};
        Assert.assertArrayEquals(result, Transformer.quick_sort(input, "desc", 0, input.length-1));
    }


}
