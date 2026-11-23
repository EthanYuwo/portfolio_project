package components.gpaStore;

import java.util.ArrayList;

/**
 * {@code GPAStoreKernel} enhanced with secondary methods.
 */
public interface GPAStore extends GPAStoreKernel {

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
     * @updates this
     */
    void sort();

    /**
     * @param x
     *            number of divisions
     * @return an array of arrays containing elements from a corresponding
     *         division
     * @requires |this| != 0;
     * @clears this
     * @ensures ArrayList Contents = this ** x and #this = this ** x
     */
    ArrayList<GPAStore> split(int x);

    /**
     * @param a
     *            ArrayList of GPAStore
     * @replaces this
     * @requires |a| > 0
     * @ensures |a| = |#a| and this = elements of a[0..n]
     */
    void assemble(ArrayList<GPAStore> a);

}
