package src;

import java.util.*;
import java.util.Map.Entry;

public class AA_NumberOfDuplicatesInList {

    public static void main(String[] args) {

/*        String s = "A b a B c D a b A f G g H j k F g h";
        String sf = s.toLowerCase();
        String arr[] = sf.split(" ");

        ArrayList<String> list = new ArrayList(Arrays.asList(arr));

        Map<String, Integer> tmap = new HashMap<String, Integer>();

        for (String t : list) {
            Integer c = tmap.get(t); // System.out.println(tmap.get("a"));
            tmap.put(t, (c == null) ? 1 : c + 1);
        }

        List<Entry<String, Integer>> sortedlist = new LinkedList<Entry<String, Integer>>(tmap.entrySet());

        Collections.sort(sortedlist, new Comparator<Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Collections.reverse(sortedlist);
        sortedlist.forEach(System.out::println);*/

        String s = "Z z z A a B a N n H h J j j k k K k K";
        String sf = s.toLowerCase();

        String[] testarr = sf.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(testarr));

        Map<String, Integer> map = new HashMap<String, Integer>();


        for (String t : list) {
            Integer x = map.get(t);
            map.put(t, (x == null) ? 1 : x + 1);
        }

        System.out.println(map);

        List<Entry<String, Integer>> sortedList = new LinkedList<Entry<String, Integer>>(map.entrySet());

        Collections.sort(sortedList, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());

            }
        });

        Collections.reverse(sortedList);

        sortedList.forEach(System.out::println);






    }
}

