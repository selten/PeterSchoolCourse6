import sort.*;

/**
 * Project: Course 6 Week 1 Opdracht 2
 * Author: Peter Selten
 * Date: 16 November 2016
 */
public class SortFactory {
    public Sort getSorter(String sortType){
        if(sortType == null){
            return null;
        }
        if(sortType.equalsIgnoreCase("QUICK")){
            return new Quick();
        } else if(sortType.equalsIgnoreCase("STRAIGHTSELECTION")){
            return new StraightSelection();
        }
        return null;
    }
}