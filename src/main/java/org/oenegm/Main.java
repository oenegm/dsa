package org.oenegm;

public class Main {


    public static void main(String[] args) {
        System.out.println("NOT IMPLEMENTED");
    }

    public static boolean linearSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}