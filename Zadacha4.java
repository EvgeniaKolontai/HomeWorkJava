import java.util.ArrayList;

public class Zadacha4 {

    public static void main(String[] arg) {
        int a = 1;
        int c = 700; // кратное
        int min_value = -32767;
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int i = min_value; i<a; i++) {
            if (i % c!= 0) {
                m2.add(i);
            }
        }
        System.out.println(m2);
    }

}