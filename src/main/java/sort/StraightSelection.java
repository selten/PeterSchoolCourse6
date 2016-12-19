package sort;

import java.util.List;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 10 November 2016
 */

public class StraightSelection implements Sort {
    private List<Integer> numList;

    public void doSort() {
        for (int i= 0; i <= this.numList.size() - 1; i++){
            int sMin= this.numList.get(i); // kleinste getal (voorlopig)
            int iMin= i; // index van de getal string
            for (int j= i + 1; j < this.numList.size(); j++){
                if (this.numList.get(i).compareTo(sMin) < 0){
                    sMin= this.numList.get(j);
                    iMin= j;
                }
            }
            if (iMin != i){
                /* de kleinste string staat niet op plaats i maar verderop */
                this.numList.set(iMin,this.numList.get(i));
                this.numList.set(i,sMin);
            }
        }
    }

    public List<Integer> getNumList() {
        return this.numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }
}
