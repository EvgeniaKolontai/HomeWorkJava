//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

import java.lang.*;
public class Zadaza2 {
    public static void main (String args[]){
        int a =0;
        int b =2000;
        int c = a+(int)(Math.random()*b);
        System.out.println("Рандомное число от 0-2000: "+ c);
        int i = Integer.highestOneBit(c);
        System.out.println("Номер старшего значащего бита рандомно выпавшего числа: "+i);
    }
    
    }