package components.gpaStore;

import java.util.ArrayList;

/**
 * gpa Store.
 *
 * @param <T>
 *            type of {@code GPAStore} labels.
 */
public interface GPAStore<T> extends GPAStoreKernel<T> {

    /**
     * The lowest gpa.
     * 
     * @return the lowest gpa
     */
    double min();

    /**
     * The highest gpa.
     * 
     * @return the highest gpa
     */
    double max();

    /**
     * The average gpa.
     * 
     * @return the highest gpa
     */
    double average();

    /**
     * The gpa that shows up the most.
     * 
     * @return the highest gpa
     */
    double median();

    /**
     * @param x
     *            number of divisions
     * @return an array of arrays containing elements from a corresponding
     *         division
     */
    ArrayList<ArrayList<Double>> split(int x);

}
