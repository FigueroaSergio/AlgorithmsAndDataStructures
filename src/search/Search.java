package search;

public class Search {


    public int binarySearch(int[] arr, int n) {
        int start = 0, end = arr.length - 1;
        int position = this.middled(end);

        while (start != position) {
            if (arr[position] == n)
                return position;
            if (arr[position] < n) {
                start = position;
                position += middled(end - start);
            } else {
                end = position;
                position -= middled(end - start);
            }

        }
        if (arr[position] == n)
            return position;
        return -1;

    }

    public int middled(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return (n + 1) / 2;
    }

    public int minimum(int[] arr) {

        if (arr.length < 1) {
            return 0;
        }
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int SecondMinimum(int[] arr) {
        if (arr.length < 1) {
            return Integer.MIN_VALUE;
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int i = 1, min = arr[0], second = arr[1];
        while (i < arr.length) {
            if (arr[i] < min) {
                second = min;
                min = arr[i];
            } else if (arr[i] < second) {
                second = arr[i];
            }
            i++;
        }
        return second;
    }

    /**
     * Indexes of arr that sum k
     *
     * @param arr ordered array with at least 2 elements
     * @param k   integer
     * @return array with of two numbers
     */
    public int[] indexesToSum(int[] arr, int k) {
        if (arr.length < 2) {
            return new int[]{-1, -1};
        }
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                return new int[]{i, j};
            }
            if (sum < k) {
                i++;
            }
            if (sum > k) {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}

