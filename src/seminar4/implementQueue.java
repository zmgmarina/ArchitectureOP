package seminar4;

//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class implementQueue {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(5);
        lst.add(1);
        lst.add(2);
        lst.add(7);
        lst.add(9);
        System.out.println(lst);

        System.out.println(enqueue(lst, 6));
        System.out.println(dequeue(lst));
        System.out.println(lst);
        System.out.println(first(lst));
        System.out.println(lst);

    }

    public static LinkedList<Integer> enqueue (LinkedList<Integer> lst, int number){
       lst.addLast(number);
       return lst;
    }

    public static int dequeue (LinkedList<Integer> lst){
        int item = lst.poll();

        return item;

    }

    public static int first (LinkedList<Integer> lst){
        int item = lst.peek();



        return item;
    }

}
