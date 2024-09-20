import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.Solution;
import org.junit.jupiter.api.Test;

public class FirstNumberTest {

    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] expected = {1, 3};
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase4() {
        int[] nums = {1};
        int target = 1;
        int[] expected = {0, 0};
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase5() {
        int[] nums = {};
        int target = 1;
        int[] expected = {-1, -1};
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }
}