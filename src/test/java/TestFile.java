import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sort.*;

import static org.junit.Assert.assertEquals;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 10 November 2016
 */
public class TestFile {
    List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,64,644,35,35,465,732,426,67,44,5,35,657,5,5,4656,7635,546));
    private String l_output = "[1, 5, 5, 5, 35, 35, 35, 44, 64, 67, 426, 465, 546, 644, 657, 732, 4656, 7635]";
    private Quick q = new Quick();
    private StraightSelection straight = new StraightSelection();

    @Before
    public void setNumListsAndSort() {
        q.setNumList(l);
        straight.setNumList(l);
        q.doSort();
        straight.doSort();
    }

    @Test
    public void testQuickSort() {
        List<Integer> after = q.getNumList();
        assertEquals(after.toString(),l_output);
    }

    @Test
    public void testStraightSort() {
        List<Integer> after = straight.getNumList();
        assertEquals(after.toString(),l_output);
    }

    @Test
    public void doNothing() {
        assertEquals(null,null);
    }
}
