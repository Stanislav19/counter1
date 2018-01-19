package oop.homeWork9_10;

/*Numbers Counter. Сложность: *. Приоритет: ***.
Задан List<Integer> list. Посчитать, сколько раз в списке попадается каждое число.
Подсказка: HashMap. */

import java.util.*;

public class numbersCounter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int i1 = 0;
        for (i1 = 1; i1 <= 5; i1++) {
            list.add(i1);
        }
        for (i1 = 1; i1 <= 5; i1++) {
            list.add(i1 + 1);
        }
        for (i1 = 1; i1 <= 5; i1++) {
            list.add(i1 + 3);
        }
        for (i1 = 1; i1 <= 5; i1++) {
            list.add(i1 + 4);
        }
        /*Задали массив*/
        System.out.println("list = " + list);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++) {
            int int1 = list.get(i);
            int count;
            if (map.get(int1) != null) {
                count = map.get(int1);
            } else count = 0;
            count++;
            map.put(int1, count);
        }

        for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext(); ) {
            Integer integer = it.next();
            System.out.println("Число " + integer + " встречаеться " + map.get(integer) + " раз(a)");
        }
    }
}

