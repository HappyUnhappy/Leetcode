import com.leetcode.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates(){
        int[] array = {0, 0, 1, 1, 1, 2};
        int[] resultArray = {0, 1, 2, 1, 1, 2};

        int result = object.removeDuplicates(array);

        assertEquals(3, result);
        assertArrayEquals(resultArray, array);
    }

}
