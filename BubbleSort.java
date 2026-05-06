public class BubbleSort {

    // Bubble Sort dengan optimasi early stop
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Elemen terbesar akan berpindah ke belakang
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Tukar elemen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimasi:
            // Jika tidak ada pertukaran, array sudah terurut
            if (!swapped) {
                break;
            }
        }
    }
}
