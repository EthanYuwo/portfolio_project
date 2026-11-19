package components.gpaStore;

import components.standard.Standard;

/**
 * gpa Store Kernel.
 *
 */
public interface GPAStoreKernel extends Standard<GPAStore> {
      /**
       * Adds an element to {@code this}.
       *
       * @param x
       *              the element to be added
       * @updates this
       * @ensures |this| = |#this| + 1
       */
      void add(double x);

      /**
       * Removes an element from {@code this}.
       *
       * @param x
       *              the element to be removed
       * @return the removed element. -1 if the element is not in this.
       * @updates this
       * @ensures |this| = |#this| - 1
       */
      double remove(double x);

      /**
       * Returns the element at a given index.
       *
       * @param i
       *              index
       * @return the element at index i.
       * @requires <pre> {@code this /= <>},
       * i < |this|,
       * 0 < i
       * </pre>
       */
      double elementAt(int i);

      /**
       * The highest gpa.
       *
       * @return the highest gpa in this
       * @requires {@code this /= <>}
       */
      double max();

      /**
       * The lowest gpa.
       *
       * @return the lowest gpa in this
       * @requires {@code this /= <>}
       */
      double min();

      /**
       * Reports the length of {@code this}.
       *
       * @return the length
       * @ensures length = |this|
       */
      int length();
}
