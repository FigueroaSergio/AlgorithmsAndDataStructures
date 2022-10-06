package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void binarySearchEven() {
        Search search = new Search();
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 10}, 6);

        assertEquals(3, index);
    }

    @Test
    void binarySearchOdd() {
        Search search = new Search();
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50}, 13);

        assertEquals(8, index);
    }

    @Test
    void binarySearchUnknownEven() {
        Search search = new Search();
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50, 51}, 7);

        assertEquals(-1, index);
    }

    @Test
    void binarySearchUnknownOdd() {
        Search search = new Search();
        int index = search.binarySearch(new int[]{1, 2, 3, 6, 8, 9, 9, 10, 13, 20, 34, 50}, 7);

        assertEquals(-1, index);
    }
}