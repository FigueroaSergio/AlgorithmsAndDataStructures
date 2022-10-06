package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SortTest {

    @Test
    void selectionSort() {
        Sort sort = new Sort();
        int[] unsorted= new int[]{4, 2, 4, 52, 2, 1, 5, 6, 8};
        int[]sorted = sort.selectionSort(unsorted);
        assertArrayEquals( new int[]{1, 2, 2, 4, 4, 5, 6, 8, 52}, sorted);
    }
}