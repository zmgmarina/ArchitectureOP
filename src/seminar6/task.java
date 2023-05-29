package seminar6;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент
уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
 */

import lessons.Set;

import java.util.*;

public class task {
    private static Random random = new Random();

    public static void main(String[] args) {

        int[] numbers = new int[1000];

        int[] numbers2 = feelArray(numbers);


        System.out.println(Arrays.toString(feelArray(numbers2)));
        System.out.println(uniquePercent(numbers2));

    }
    private static int[] feelArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(24);
        }
        return arr;
    }

    private static float uniquePercent(int[] arr){
        HashSet<Integer> nums = new HashSet<>();
        for (int n: arr) {
            nums.add(n);

        }
        return nums.size() * 100f / arr.length;
    }



}
