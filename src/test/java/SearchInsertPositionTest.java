import com.leetcode.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    @Test
    void targetExistsInArray() {
        assertEquals(2, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void oneElementInArrayWithoutTarget() {
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1}, 0));
    }

    @Test
    void targetShouldBeInTheBeginOfArray() {
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    void targetShouldBeInTheMiddleOfArray() {
        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void targetShouldBeInTheEndOfArray() {
        assertEquals(4, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
