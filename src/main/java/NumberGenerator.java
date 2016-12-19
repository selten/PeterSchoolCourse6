import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 10 November 2016
 */
public class NumberGenerator {
    private int largestNumber = 100;
    private List<Integer> numList = new ArrayList<Integer>();

    public NumberGenerator(int amount) {
        for(int i =0; i<amount; i++) {
            int num = generateNumber();
            addNumberToNumList(num);
        }
    }

    public NumberGenerator(int amount, int largestNumber) {
        this.largestNumber = largestNumber;
        for(int i =0; i<amount; i++) {
            int num = generateNumber();
            addNumberToNumList(num);
        }
    }

    private void addNumberToNumList(int num) {
        numList.add(num);
    }

    private int generateNumber() {
        return new Random().nextInt(this.largestNumber);
    }

    public List<Integer> getNumList() {
        return numList;
    }
}
