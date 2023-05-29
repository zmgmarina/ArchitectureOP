package seminar4;

// Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи.
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например: 5 4 3 - + => 5 1 + => 6


import java.util.Scanner;
import java.util.Stack;

public class calkPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите постфиксное выражение для вычисления: ");
        String input = scanner.nextLine();
        String[] elementsCalc = input.split(" ");

        int res = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < elementsCalc.length; i++) {
            if (isDigit(elementsCalc[i])) {   //если элемент строки число
                st.push(Integer.parseInt(elementsCalc[i])); //преобразуем элементы в int, добавляем число в стэк
            } else {
                switch (elementsCalc[i]) {
                    case "+":
                        res = st.pop() + st.pop(); //если +, извлекаем элементы в переменную, складываем и возвращаем в стэк
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        if (st.size() == 1){
            System.out.printf("%d\n", st.pop());
        }else {
            System.out.println("Введены некорректные данные");
        }



    }

    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



}
