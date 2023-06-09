import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.example.lab3.InsertionSort;

public abstract class AbstractSortTest {

    protected void runAndMeasureAlgorithm(String algorithm, int arraySize) {
        int[] elements = generateArray(arraySize);

        int min = getMin(elements);
        int max = getMax(elements);

        long start = System.currentTimeMillis(); // start measuring time
        switch (algorithm) {
            case "insertion":
                InsertionSort.sort(elements);
                break;
            default:
                System.out.println("Invalid algorithm selected. Use 'bubble', 'selection', 'insertion', 'shell', "
                        + "'recursive-merge', 'iterative-merge', 'quick', 'radix', 'radix-alt' or 'heap'.");
                return;
        }

        assertEquals(min, elements[0]);
        assertEquals(max, elements[arraySize - 1]);

        long timeElapsed = System.currentTimeMillis() - start;
        System.out.println("Elapsed time for " + algorithm + " sort on " + arraySize + " elements: " + timeElapsed + " ms");
    }

    /**
     * Generate an array of random integers with a given size.
     * @param size
     */
    protected int[] generateArray(int size) {
        int[] elements = new int[size];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = new Random().nextInt(size * 10);
        }

        return elements;
    }

    private static int getMin(int[] elements) {
        int min = Integer.MAX_VALUE;
        for (int i: elements)
        {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    private static int getMax(int[] elements) {
        int max = Integer.MIN_VALUE;
        for (int i: elements)
        {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }
}