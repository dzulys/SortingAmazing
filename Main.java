public class Main {

    // Fungsi untuk menampilkan array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] dataBubble = {5, 3, 8, 4, 2};
        int[] dataBinary = {5, 3, 8, 4, 2};

        System.out.println("Data sebelum Bubble Sort:");
        printArray(dataBubble);

        BubbleSort.bubbleSort(dataBubble);

        System.out.println("Data setelah Bubble Sort:");
        printArray(dataBubble);

        System.out.println();

        System.out.println("Data sebelum Binary Insertion Sort:");
        printArray(dataBinary);

        BinaryInsertionSort.binaryInsertionSort(dataBinary);

        System.out.println("Data setelah Binary Insertion Sort:");
        printArray(dataBinary);
    }
}
