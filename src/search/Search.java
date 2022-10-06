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
}

