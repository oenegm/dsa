package org.oenegm;

public class Main {


    public static void main(String[] args) {
        System.out.println("NOT IMPLEMENTED");
    }

    public static boolean binarySearchLoop(int[] arr, int value) {
        int low = 0;
        int high = arr.length;

        do {
            int middle = low + (high - low) / 2;
            int current = arr[middle];

            if (current == value) {
                return true;
            } else if (current > value) {
                high = middle;
            } else {
                low = middle + 1;
            }

        } while (low < high);

        return false;
    }

    public static boolean binarySearchRecursion(int[] arr, int value) {
        return binarySearchRecursion(arr, value, 0, arr.length);
    }

    private static boolean binarySearchRecursion(int[] arr, int value, int low, int high) {

        if (low > high) {
            return false;
        }

        int middle = low + (high - low) / 2;
        int current = arr[middle];

        if (current == value) {
            return true;
        } else if (current > value) {
            return binarySearchRecursion(arr, value, low, middle - 1);
        } else {
            return binarySearchRecursion(arr, value, middle + 1, high);
        }
    }
}