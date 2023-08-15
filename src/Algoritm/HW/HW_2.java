package Algoritm.HW;

import Algoritm.sem_2.Ex1;

public class HW_2 {
    public static void main(String[] args) {

        int[] arr = new int []{1,6,8,9,7,4,3,5,6};

        printArray(arr);
        heapSort(arr);
        printArray(arr);
    }

    /**
     * @apiNote печать массива
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   System.out.println();
    }

    /**
     * @apiNote метод сортировки кучей
     * @param array
     */
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    /**
     * @apiNote метод построения кучи
     * @param array
     * @param heapSize
     * @param rootIndex
     */
    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
}
