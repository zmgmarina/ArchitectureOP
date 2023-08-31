package Exception.HW2.Task2;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели два числа: " + a + " и " + b);

        try {
            double result = divide(a, b);
            System.out.println("Результат деления чисел = " + result);

        }catch (DivizionByZeroException e){
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int a, int b) throws DivizionByZeroException {
        if (b == 0) {
            throw new DivizionByZeroException("Деление на ноль недопустимо");
        }return (double) a / b;
    }
}
