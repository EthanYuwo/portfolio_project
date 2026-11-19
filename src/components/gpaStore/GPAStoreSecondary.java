package components.gpaStore;

import java.util.ArrayList;

/**
 * GPA Store Secondary.
 *
 */
public abstract class GPAStoreSecondary implements GPAStore {

    @Override
    public final double average() {
        double average = 0;
        for (int i = 0; i < this.length(); i++) {
            average += this.elementAt(i);
        }
        return average / (this.length());
    }

    @Override
    public final double median() {
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
        GPAStore temp = new GPAStore1L();
        while (this.length() > 0) {
            double m = this.min();
            temp.add(this.remove(m));
        }
        this.transferFrom(temp);
    }

    @Override
    public final ArrayList<GPAStore> split(int x) {
        ArrayList<GPAStore> a = new ArrayList<>();
        int splitI = this.length() / x;
        for (int i = 0; i < x; i++) {
            GPAStore g = this.newInstance();
            for (int j = 0; j < splitI; j++) {
                g.add(this.elementAt(j + splitI * i));
            }
            a.add(g);
        }
        return a;
    }

}
