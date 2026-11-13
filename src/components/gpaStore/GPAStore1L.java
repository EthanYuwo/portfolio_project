package components.gpaStore;

import java.util.ArrayList;

/**
 * GPAStore1L.
 *
 * @param <T>
 */
public class GPAStore1L<T> extends GPAStoreSecondary<T> {
    /**
     * Represention of this.
     */
    private ArrayList<Double> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new ArrayList<Double>();
    }

    /**
     * @return new instance
     */
    @SuppressWarnings("unchecked")
    public final GPAStore<T> newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    /**
     * Clear this.
     */
    public final void clear() {
        this.createNewRep();
    }

    /**
     * @param source
     */
    public final void transferFrom(GPAStore<T> source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof GPAStore1L<?>
        : "Violation of: source is of dynamic type GPAStore1L<?>";
        GPAStore1L<T> localSource = (GPAStore1L<T>) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /**
     * No-argument constructor.
     */
    public GPAStore1L() {
        this.createNewRep();
    }

    /**
     * @param x
     *            the element to be added
     */
    @Override
    public final void add(double x) {
        this.rep.add(x);
    }

    /**
     * @param x
     *            the element to be added
     */
    @Override
    public final double remove(double x) {
        int i = 0;
        double r = 0;
        while (this.rep.get(i) != x) {
            i++;
            if (i >= this.length()) {
                throw new AssertionError("Element not in this");
            }
        }
        r = this.rep.remove(i);
        return r;
    }

    /**
     * @return length.
     */
    @Override
    public final int length() {
        int l = this.rep.size();
        return l;
    }

}
