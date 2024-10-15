import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[15];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;

        }


        System.out.print("Початковий вигляд масиву: ");
        printArray(array);

        insertionSort(array);

        System.out.print("Відсортований масив: ");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число " + target + " не знайдено у масиві.");

        }

    }

    private static void printArray(int[] array) {

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");

            }

        }

        System.out.println("]");

    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = key;

        }

    }


    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;

            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }

        }

        return -1;

    }

}