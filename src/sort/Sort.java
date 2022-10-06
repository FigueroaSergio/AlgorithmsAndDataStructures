package sort;

public class Sort {

    public Sort() {
    }

        public int[] selectionSort(int[] arr) {
            int[] sorted = arr.clone();
            for (int i = 0; i < sorted.length - 1; i++) { //2c n-1
                int min = i; // c(n-1)
                for (int j = i + 1; j < sorted.length; j++) {  //2c sum i=1+1 to n-2
                    if (sorted[j] < sorted[min])
                        min = j;
                }
                //3c
                int temp = sorted[i];
                sorted[i] = sorted[min];
                sorted[min] = temp;

            }
            return sorted;
        }
}
