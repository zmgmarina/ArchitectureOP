package seminar4;
import java.util.*;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class reversList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(5);
        lst.add(1);
        lst.add(2);
        lst.add(7);
        lst.add(9);
        System.out.println(lst);

        System.out.println(reversList(lst));

    }

    public static LinkedList<Integer> reversList(LinkedList<Integer> lst) {
        LinkedList<Integer> res = new LinkedList<>();

        for (Integer num : lst) {
            res.addFirst(num);
        }
        return res;
    }




}


