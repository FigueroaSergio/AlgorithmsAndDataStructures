package search;

import java.util.HashMap;
import java.util.Map;

public class Search {


    public int binarySearch(int[] arr, int n) {
        if (arr.length < 1) {
            return -1;
        }
        int start = 0, end = arr.length - 1;


        while (start < end) {
            int position = start + this.middled(end - start);
            if (arr[position] == n)
                return position;
            if (arr[position] < n) {
                start = position + 1;
            } else {
                end = position - 1;
            }

        }
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

    public int[] SecondMinimum(int[] arr) {
        if (arr.length < 2) {
            return new int[]{};
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
        return new int[]{min, second};
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
            return new int[]{};
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
        return new int[]{};
    }

    public int winnerHalf(int[] arr) {
        int half = arr.length / 2;
        Map<Integer, Integer> memory = new HashMap<>();
        for (int val : arr) {
            int count = 0;
            if (memory.containsKey(val)) {
                count = memory.get(val);
            }
            count++;

            if (count > half) {
                return val;
            }
            memory.put(val, count);
        }
        return 0;
    }

    /**
     * Precondition: exist a value that appears more than n/2
     */
    public int[] boyerMoore(int[] arr) {
        if (arr.length < 1) {
            return new int[]{};
        }
        int majority = 0, count = 0;
        for (int val : arr) {
            if (count == 0) {
                majority = val;
            }
            count += (val == majority) ? 1 : -1;
        }

        return count > 0 ? new int[]{majority} : new int[]{};
    }

    // Don't work
    // TODO:
    // Divide in two cases when MCM != 1
    public void copyPasteMat(int[] arr, int i) {
        int lung = arr.length - 1;
        if (i >= lung) {
            return;
        }
        int count = 0;
        int prev, next;
        int aux = 0;
        prev = arr[i + 1];
        while (count <= i + 1) {
            if (aux < 0) {
                aux = count;
            }
            next = arr[aux];
            arr[aux] = prev;
            prev = next;
            if (count == aux) {
                aux = lung - i + count;
                count++;
            } else {
                aux = aux - i - 1;
            }

        }


    }
}

