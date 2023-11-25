package org.oenegm;

public class Main {


    public static void main(String[] args) {
        System.out.println("Not Implemented");
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(array, low, high);

        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int index = low - 1;

        for (int i = low; i < high; i++) {
            if (array[i] <= pivot) {
                index++;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }

        index++;
        array[high] = array[index];
        array[index] = pivot;

        return index;
    }
}