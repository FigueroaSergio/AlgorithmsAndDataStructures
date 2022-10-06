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
    void minimunEmptyArray() {
        assertEquals(0, search.minimum(new int[]{}));
    }

    @Test
    void minimunWithNegativeValues() {
        assertEquals(-4, search.minimum(new int[]{1, 2, 3, 4, -1, 5, -4, 10}));
    }

    @Test
    void minimun() {
        assertEquals(1, search.minimum(new int[]{2, 2, 3, 1, 6, 5, 8, 10}));
    }
}