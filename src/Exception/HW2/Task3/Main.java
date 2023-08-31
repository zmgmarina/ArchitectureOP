package Exception.HW2.Task3;

import Exception.HW2.Task2.DivizionByZeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Вы ввели три числа: " + a + ", "+ b +", " + c);

        try {
            checkingForExceptions(a, b, c);

        }catch (NumberOutOfRangeException e){
            System.out.println(e.getMessage());
        }catch (NumberSumException e){
            System.out.println(e.getMessage());
        }catch (DivizionByZeroException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkingForExceptions(int a, int b, int c) throws NumberOutOfRangeException, NumberSumException, DivizionByZeroException{
        if (a > 100){
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0){
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a+b < 10){
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0){
            throw  new DivizionByZeroException( "Деление на ноль недопустимо");
        }
        else {
            System.out.println("Проверка пройдена успешно");
        }
    }
}
