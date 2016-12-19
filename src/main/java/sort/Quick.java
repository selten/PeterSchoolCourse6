package sort;

import java.util.List;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 10 November 2016
 */

public class Quick implements Sort {
    private List<Integer> numList;

    public void doSort() {
        quicksort(0, this.numList.size() - 1);
    }

    public List<Integer> getNumList() {
        return this.numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = getPivot(low, high);

        while (i <= j) {
            while (numList.get(i) < pivot) {
                i++;
            }
            while (numList.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    //Haal de middelste waarde op voor de snelste sortering
    private int getPivot(int low, int high) {
        return numList.get(low + (high-low)/2);
    }

    //Verwissel 2 nummers
    private void exchange(int i, int j) {
        int temp = numList.get(i);
        numList.set(i,numList.get(j));
        numList.set(j,temp);
    }
}
