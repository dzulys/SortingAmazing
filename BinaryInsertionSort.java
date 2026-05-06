public class BinaryInsertionSort {

    // Fungsi Binary Search untuk mencari posisi penyisipan
    public static int binarySearch(int[] arr, int item, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;

            if (item == arr[mid]) {
                return mid + 1;
            }

            if (item > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    // Binary Insertion Sort
    public static void binaryInsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            // Cari posisi menggunakan binary search
            int position = binarySearch(arr, key, 0, i - 1);

            // Geser elemen ke kanan
            int j = i - 1;

            while (j >= position) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
