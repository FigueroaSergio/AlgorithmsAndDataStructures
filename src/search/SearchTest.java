package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    Search search = new Search();

    @Test
    void binarySearchEven() {
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 10}, 6);

        assertEquals(3, index);
    }

    @Test
    void binarySearchOdd() {
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50}, 13);

        assertEquals(8, index);
    }

    @Test
    void binarySearchUnknownEven() {
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50, 51}, 7);

        assertEquals(-1, index);
    }

    @Test
    void binarySearchUnknownOdd() {
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50}, 7);

        assertEquals(-1, index);
    }

    @Test
    void minimumEmptyArray() {
        assertEquals(0, search.minimum(new int[]{}));
    }

    @Test
    void minimumWithNegativeValues() {
        assertEquals(-4, search.minimum(new int[]{1, 2, 3, 4, -1, 5, -4, 10}));
    }

    @Test
    void minimum() {
        assertEquals(1, search.minimum(new int[]{2, 2, 3, 1, 6, 5, 8, 10}));
    }

    @Test
    void secondMinimum() {
        assertArrayEquals(new int[]{1, 4}, search.SecondMinimum(new int[]{1, 6, 7, 8, 4, 5, 12, 34, 13}));
    }

    @Test
    void secondMinimumWithNegative() {
        assertArrayEquals(new int[]{-12, -6}, search.SecondMinimum(new int[]{1, 6, -3, 4, -6, 7, 8, 4, 5, -12, 34, 13}));
    }

    @Test
    void indexesToSum() {
        assertArrayEquals(new int[]{2, 6}, search.indexesToSum(new int[]{1, 2, 3, 4, 6, 7, 9, 13, 23}, 12));
    }

    @Test
    void indexesToSumNonExist() {
        assertArrayEquals(new int[]{}, search.indexesToSum(new int[]{1, 2, 3, 4, 6, 7, 9, 13, 23}, 18));
    }

    @Test
    void winnerHalf() {
        assertEquals(5, search.winnerHalf(new int[]{5, 3, 5, 1, 5, 7, 2, 5, 6, 5, 4, 5, 5, 5, 7}));
    }

    @Test
    void copyPaste() {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8};
        search.copyPasteMat(n, 1);
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8, 1, 2}, n);
    }

    @Test
    void copyPasteEven() {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        search.copyPasteMat(n, 3);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9, 1, 2, 3, 4}, n);
    }
}