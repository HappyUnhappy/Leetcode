import com.leetcode.FirstBadVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersionTest {
    @Test
    void test1() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        firstBadVersion.setBadVersion(4);

        int result = firstBadVersion.firstBadVersion(5);

        assertEquals(4, result);
    }

    @Test
    void test2() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        firstBadVersion.setBadVersion(1);

        int result = firstBadVersion.firstBadVersion(1);

        assertEquals(1, result);
    }

    @Test
    void test3() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        firstBadVersion.setBadVersion(1702766719);

        int result = firstBadVersion.firstBadVersion(2126753390);

        assertEquals(1702766719, result);
    }
}
