package components.gpaStore;

import java.util.ArrayList;

/**
 * {@code GPAStore} represented by {@link java.util.ArrayList} with
 * implementation of primary methods.
 *
 * @convention value of $this.rep > 0
 * @correspondence this = [value of $this.rep]
 *
 */
public class GPAStore1L extends GPAStoreSecondary {
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
     * Standard Methods.
     */

    @Override
    public final GPAStore newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(GPAStore source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source
        instanceof GPAStore1L : "Violation of: source is of dynamic type GPAStore1L";
        GPAStore1L localSource = (GPAStore1L) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /**
     * No-argument constructor.
     */
    public GPAStore1L() {
        this.createNewRep();
    }

    /*
     * Kernel methods.
     */

    @Override
    public final void add(double x) {
        assert x > 0;
        this.rep.add(x);
    }

    @Override
    public final double remove(double x) {
        assert this.length() > 0;

        double r = 0;
        boolean b = this.rep.remove(x);
        if (b) {
            r = x;
        } else {
            r = -1;
        }
        return r;
    }

    @Override
    public final double elementAt(int i) {
        assert this.length() > 0;
        assert (i < this.length() && 0 < i);

        return this.rep.get(i);
    }

    @Override
    public final double max() {
        assert this.length() > 0;

        double m = this.rep.get(0);
        for (int i = 0; i < this.rep.size(); i++) {
            if (this.rep.get(i) > m) {
                m = this.rep.get(i);
            }
        }
        return m;
    }

    @Override
    public final double min() {
        assert this.length() > 0;

        double m = this.rep.get(0);
        for (int i = 0; i < this.rep.size(); i++) {
            if (this.rep.get(i) < m) {
                m = this.rep.get(i);
            }
        }
        return m;
    }

    @Override
    public final int length() {
        int l = this.rep.size();
        return l;
    }

}
