package components.gpaStore;

import java.util.ArrayList;

/**
 * GPA Store Secondary. IMPLEMENT EQUALS, HASHCODE, AND TOSTRING.
 *
 */
public abstract class GPAStoreSecondary implements GPAStore {

    @Override
    public final double average() {
        assert this.length() > 0;
        double average = 0;
        for (int i = 0; i < this.length(); i++) {
            average += this.elementAt(i);
        }
        return average / (this.length());
    }

    @Override
    public final double median() {
        assert this.length() > 0;
        double med = 0;
        int l = this.length();
        if (l % 2 == 0) {
            med = (this.elementAt(l / 2) + this.elementAt(l / 2 + 1)) / 2;
        } else {
            med = this.elementAt(l / 2);
        }
        return med;
    }

    @Override
    public final void sort() {
        assert this.length() > 0;
        GPAStore temp = new GPAStore1L();
        while (this.length() > 0) {
            double m = this.min();
            temp.add(this.remove(m));
        }
        this.transferFrom(temp);
    }

    @Override
    public final ArrayList<GPAStore> split(int x) {
        assert this.length() > 0;
        ArrayList<GPAStore> a = new ArrayList<>();
        int split = this.length() / x;
        int splitR = this.length() % x;

        for (int i = 0; i < x; i++) {
            GPAStore g = this.newInstance();
            if (i + 1 == x) {
                for (int j = 0; j < split + splitR; j++) {
                    g.add(this.elementAt(j + split * i));
                }
            } else {
                for (int j = 0; j < split; j++) {
                    g.add(this.elementAt(j + split * i));
                }
            }
            a.add(g);
        }

        this.clear();
        return a;
    }

    @Override
    public final void assemble(ArrayList<GPAStore> a) {
        GPAStore g = this.newInstance();
        for (GPAStore x : a) {
            for (int i = 0; i < x.length(); i++) {
                g.add(x.elementAt(i));
            }
        }
        this.transferFrom(g);
    }

}
