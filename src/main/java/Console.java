import java.util.List;
import sort.*;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 10 November 2016
 */

public class Console {
    private static String sortalgorithm = "QUICK";
    private static int amount = 1000000;
    private static int maxNumber = 1000000000;
    private static NumberGenerator numgen = new NumberGenerator(amount,maxNumber);
    private static List<Integer> numbers = numgen.getNumList();
    private static SortFactory sf = new SortFactory();

    public static void main(String[] args) {
        List<Integer> sortednumbers = null;
        long sort_start, sort_stop;
        Sort sort;

        sort = sf.getSorter(sortalgorithm);

        System.out.println("Starting sorting.");

        sort.setNumList(numbers);
        sort_start = System.currentTimeMillis();
        sort.doSort();
        sort_stop = System.currentTimeMillis();
        //sortednumbers = sort.getNumList();


        System.out.println("Finished sorting in "+calculateTimeDifference(sort_start,sort_stop)+" milliseconds");

//        System.out.println("Quick sort");
//        showNumbers(s_quick.getNumList());
    }

    private static void showNumbers(List<Integer> numbers) {
        for(int i =0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static long calculateTimeDifference(long start, long stop) {
        return stop-start;
    }
}
