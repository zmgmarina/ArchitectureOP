package Exception.HW2.Task1;

import java.util.Scanner;
// Напишите программу, которая запрашивает у пользователя число и проверяет,
// является ли оно положительным. Если число отрицательное или равно нулю,
// программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
// В противном случае, программа должна выводить сообщение "Число корректно".

public class Main {
    public static void main(String[] args) {

        try {
            inputNumber();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @apiNote Проверка на корректность вводимого пользователем числа
     * @throws InvalidNumberException
     */
    public static void inputNumber() throws InvalidNumberException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number <= 0){
            throw new InvalidNumberException("Введено некорректное число:  " + number);
        }
        else {
            System.out.println("Число корректно:  " + number);
        }
    }
}
