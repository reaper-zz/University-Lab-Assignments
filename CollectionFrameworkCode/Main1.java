package CollectionFrameworkCode;

import java.util.LinkedList;

public class Main1 {

     public static void main(String[] args) {
 
        LinkedList<Integer> list = new LinkedList<>();
 
        // add()
        list.add(10);
        list.add(20);
 
        // addFirst()
        list.addFirst(5);
 
        // addLast()
        list.addLast(30);
 
        // getFirst()
        System.out.println(list.getFirst());
 
        // getLast()
        System.out.println(list.getLast());
 
        // removeFirst()
        list.removeFirst();
 
        // removeLast()
        list.removeLast();
 
        // peek()
        System.out.println(list.peek());
 
        System.out.println(list);
    }
}
