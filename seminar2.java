import java.util.Random;

import java.util.Collections;
import java.util.ArrayList;
public class seminar2 {
   public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<>();
    
    Random rnd = new Random();
            for (int i = 0; i < 20; i++) {
                list1.add(Character.getName(rnd.nextInt(5)));
                            }
   System.out.println(list1.size());
   System.out.println();
    System.out.println(list1);
    System.out.println();
    Collections.sort(list1,Collections.reverseOrder());
    
    System.out.println(list1);
   } 
}
