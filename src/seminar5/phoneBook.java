package seminar5;

import java.util.*;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек
может иметь несколько телефонов.*/
public class phoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        map.put("Наташа", Arrays.asList("233335641", "2454544544", "211131444"));
        map.put("Егор", Arrays.asList("654654545", "4634364464"));
        map.put("Маша", Arrays.asList("835634544", "3243232433", "363644433"));
        map.put("Саша", Arrays.asList("323665565", "878434511"));

        System.out.println(map.get("Саша"));

        for (Map.Entry<String,List<String>> entry : map.entrySet()) {
            System.out.printf("[%s = %s]\n", entry.getKey(), entry.getValue());
        }


    }

}
