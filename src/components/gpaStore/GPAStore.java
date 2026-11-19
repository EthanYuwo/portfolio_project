package components.gpaStore;

import java.util.ArrayList;

/**
 * {@code GPAStoreKernel} enhanced with secondary methods.
 */
public interface GPAStore extends GPAStoreKernel {

    /**
     * The lowest gpa.
     *
     * @return the lowest gpa in this
     * @requires {@code this /= <>}
     * @ensures {|this| = |#this|}
     */
    @Override
    double min();

    /**
     * The highest gpa.
     *
     * @return the highest gpa in this
     * @requires {@code this /= <>}
     * @ensures {|this| = |#this|}
     */
    @Override
    double max();

    /**
     * The average gpa.
     *
     * @return the highest gpa
     * @requires {@code this /= <>}
     * @ensures {|this| = |#this|}
     */
    double average();

    /**
     * The gpa that shows up at the middle.
     *
     * @return the highest gpa
     * @requires {@code this /= <>}
     * @ensures {|this| = |#this|}
     */
    double median();

    /**
     * Elements in this sorted from lowest to highest.
     *
     */
    void sort();

    /**
     * @param x
     *            number of divisions
     * @return an array of arrays containing elements from a corresponding
     *         division
     * @requires |this| % x = 0
     * @ensures ArrayList Contents = this ** x and #this = this ** x
     */
    ArrayList<GPAStore> split(int x);

}
