package org.example;
//1.3.1

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        int target = 9;
//        int low = 3;
//        int high = array.length - 10;

//        int result = binarySearch(array, target, low, high);
//
//        if (result != -1) {
//            System.out.println("Елемент " + target + " знайдено  " + result);
//        } else {
//            System.out.println("Елемент " + target + "  не знайдено");
        System.out.println(binarySearch (array,7, 1, array.length - 5));
        }


    public static int binarySearch(int[] array, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return array[mid];
            }

            else if (array[mid] > target) {
                return binarySearch(array, target, low, mid - 1);
            } else {
                return binarySearch(array, target, mid + 1, high);
            }
        } else {
            return -1; // not found
        }
    }
}