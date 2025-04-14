package List;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

    //Elements are stored in the form of nodes
    //two types of linked lists i) single linked_list ii)Double linked_list
    //single ll --> it stores next node address(uni directional)
    //Double ll --> it stores previous node and next node address.(By-directional)
    //More Efficient in insertion and deletion of elements.


    public static void main(String[] args) {

        LinkedList<Integer> l_list = new LinkedList<>();
        Collections.addAll(l_list,20,30,40,50,60,80);

        System.out.println(l_list.getFirst()); // getting the first element
        System.out.println(l_list.getLast()); // getting the last element

        l_list.push(30); // pushes element to the start
        l_list.poll(); // removes and return the first element
        l_list.reversed(); // reverses the list
        System.out.println(l_list.peek()); // return the first element

      }
}
