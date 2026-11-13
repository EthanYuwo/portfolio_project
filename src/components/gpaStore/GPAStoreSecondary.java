package components.gpaStore;

import java.util.ArrayList;

/**
 * GPA Store Secondary.
 *
 * @param <T>
 */
public abstract class GPAStoreSecondary<T> implements GPAStore<T> {
    /**
     * values stored inside.
     */
    private ArrayList<Double> values;

    /**
     * new representation with ArrayList.
     */
    public GPAStoreSecondary() {
        this.values = new ArrayList<>();
    }

    /**
     * The lowest gpa.
     *
     * @return the lowest gpa
     */
    @Override
    public double min() {
        double m = this.values.get(0);
        for (double x : this.values) {
            if (m > x) {
                m = x;
            }
        }
        return m;
    }

    /**
     * The highest gpa.
     *
     * @return the highest gpa
     */
    @Override
    public double max() {
        double m = this.values.get(0);
        for (double x : this.values) {
            if (m < x) {
                m = x;
            }
        }
        return m;
    }

    /**
     * The average gpa.
     *
     * @return the highest gpa
     */
    @Override
    public double average() {
        double average = 0;
        for (double x : this.values) {
            average += x;
        }
        return average / (this.values.size());
    }

    /**
     * The gpa that shows up the most.
     *
     * @return the median gpa
     */
    @Override
    public double median() {
        double med = 0;
        int l = this.values.size();
        if (l % 2 == 0) {
            med = this.values.get(l / 2);
        } else {
            med = this.values.get(l / 2 + 1);
        }
        return med;
    }

    /**
     * The gpa that shows up the most.
     *
     * @return Array of arrays containing elements in x subvisions from this
     */
    @Override
    public ArrayList<ArrayList<Double>> split(int x) {
        ArrayList<ArrayList<Double>> a = new ArrayList<>();
        int splitI = this.values.size() / x;
        for (int i = 0; i < x; i++) {
            ArrayList<Double> t = new ArrayList<>();
            for (int j = 0; j < splitI; j++) {
                t.add(this.values.get(j + splitI * i));
            }
            a.add(t);
        }
        return a;
    }

}
