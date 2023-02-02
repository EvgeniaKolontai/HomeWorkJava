import java.util.*;
public class Task6 {
    private static HashMap<Integer, Object> hmap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(25);
        addToHMap(1);
        addToHMap(3);
        addToHMap(25);
        addToHMap(15);
        addToHMap(4);
        addToHMap(8);
        System.out.println(hmap.keySet());
        Iterator<Integer> iterator = hmap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

private static void addToHMap(Integer number) { // через hashMap
    hmap.put(number, OBJ);
}
}