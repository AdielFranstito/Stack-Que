public class latihan2noLib {
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 3, 8, 2};

        System.out.println("Unsorted stack: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sortStack(array);

        System.out.println("\nSorted stack: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortStack(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }
}
