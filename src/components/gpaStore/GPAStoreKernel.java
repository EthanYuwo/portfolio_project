package components.gpaStore;

/**
 * gpa Store Kernel.
 *
 * @param <T>
 */
public interface GPAStoreKernel<T> {
      /**
       * @param x
       *              the element to be added
       */
      void add(double x);

      /**
       * @param x
       *              the element to be removed
       * @return the removed element
       */
      double remove(double x);

      /**
       * @return the length
       */
      int length();
}
