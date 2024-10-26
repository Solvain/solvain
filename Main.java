package org.example;

import java.util.Arrays;

public class Main {
    private int[] array;

    public Main(int[] array) {
        this.array = array;
    }

    public int[] sortArray() {
        // Сортируем массив целых чисел
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    // Для тестирования
    public static void main(String[] args) {
        Main parser = new Main(new int[]{5, 2, 9, 1, 5, 6});
        int[] sortedArray = parser.sortArray();
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}

