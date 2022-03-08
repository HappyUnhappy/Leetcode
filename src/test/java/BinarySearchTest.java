
import com.leetcode.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    BinarySearchTest() {
        binarySearch = new BinarySearch();
    }

    @Test
    void test1() {
        int[] array = {1, 2, 3, 4, 5};

        int result = binarySearch.search(array, 4);

        assertEquals(3, result);
    }

    @Test
    void test2() {
        int[] array = {-1, 0, 3, 5, 9, 12};

        int result = binarySearch.search(array, 9);

        assertEquals(4, result);
    }

    @Test
    void test3() {
        int[] array = {-1, 0, 3, 5, 9, 12};

        int result = binarySearch.search(array, 2);

        assertEquals(-1, result);
    }

    @Test
    void test4() {
        int[] array = {5};

        int result = binarySearch.search(array, 5);

        assertEquals(0, result);
    }
}
