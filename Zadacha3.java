import java.util.ArrayList;

public class Zadacha3 {

    public static void main(String[] arg) {
        int a = 1;
        int c = 6; // кратное
        int max_value = 32767;
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for (int i = a; i < max_value; i++) {
            if (i % c == 0) {
                m1.add(i);
            }
        }
        System.out.println(m1);
    }

}
