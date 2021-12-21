public class Test {
    public static void main(String[] args) {
        int[] ints = {2, 3, 5, 7, 4, 6, 1, 9};
//        bubbleSort(ints);
//        selectionSort(ints);
        insertionSort(ints);

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public static void bubbleSort(int[] ints) {
        // So sánh các cặp int để sắp xếp dần dần
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] ints) {
        // Tìm min và đặt vào đầu mảng.
        for (int i = 0; i < ints.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[min] > ints[j]) {
                    min = j; // Chọn vị trí
                }
            }
            if (min != i) {
                int temp = ints[min];
                ints[min] = ints[i];
                ints[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int key = ints[i];
            int pos = i - 1;
            while (pos >= 0 && ints[pos] > key) {
                ints[pos + 1] = ints[pos];
                pos--;
            }
            ints[pos + 1] = key;
        }
    }
}
