// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Seminar4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rnd = new Random();
        int size = rnd.nextInt(10);
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            int num = rnd.nextInt(10);
            ll.add(num);
            
        }
        System.out.println("Исходный список имеет вид : " + ll);

        Iterator<Integer> iter = ll.descendingIterator();

        while (iter.hasNext()){
            System.out.print(iter.next() + ",");
        }

        Collections.reverse(ll);
        System.out.println("\n" + ll);

        

        
        
    }

    // public static int[] revers(int[] arr) {
    //     int[] revlist = new int[arr.length];

    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         revlist[i]
    //     }

        
    // }
}
