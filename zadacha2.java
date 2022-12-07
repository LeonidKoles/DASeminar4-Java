// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(9);
        ll.add(47);
        System.out.println(ll);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элемент");
        int n = scan.nextInt();
        enqueue(ll, n);
        System.out.println(ll);
        dequeue(ll);
        System.out.println(ll);
        first(ll);
        System.out.println(ll);


         
    }

    public static void enqueue(LinkedList<Object> name, int n) {
        name.addLast(n);        
    }
    public static void dequeue(LinkedList<Object> name) {
        System.out.println(name.pop());
        
    }
    public static void first(Deque<Object> name) {
        System.out.println(name.getFirst());

        
    }
}
