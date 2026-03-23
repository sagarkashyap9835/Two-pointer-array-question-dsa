// import java.util.Deque;
// import java.util.ArrayDeque;

// public class addelement {
//   public static void main(String[] args){

//     Deque<Integer> queue = new ArrayDeque<>();

//     queue.add(1);
//     queue.add(2);
//     queue.add(3);
//     queue.add(4);
//     queue.addFirst(10);

//     System.out.println(queue);
//   }  
// }

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class addelement {
  public static void main(String[] args){

    ArrayDeque queue=new ArrayDeque<>();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    // queue.addFirst(10);
    int k=2;
    for(int i=0;i<k;i++){
        queue.addFirst(queue.removeLast());
    }

    System.out.print(queue);
  }  
}