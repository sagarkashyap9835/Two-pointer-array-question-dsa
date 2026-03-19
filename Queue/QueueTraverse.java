import java.util.*;

// import java.util.*;

public class QueueTraverse {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        int size = q.size();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++) {
            int val = q.poll();   

            // traversal print
            System.out.print(val + " ");

            // min update
            if(val < min){
                min = val;
            }
            if(val > max){
                max = val;
            }

            q.add(val); 
        }

        System.out.println();
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}






// import java.util.*;

// public class QueueTraverse {
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         int k = 3;
//         System.out.println("Original Queue: " + q);

//         Stack<Integer> stack = new Stack<>();

//         // Step 1: First k elements stack me daalo
//         for(int i = 0; i < k; i++){
//             stack.push(q.poll());
//         }

//         // Step 2: Stack se wapas queue me daalo
//         while(!stack.isEmpty()){
//             q.add(stack.pop());
//         }

//         // Step 3: Remaining elements ko rotate karo
//         int size = q.size();
//         for(int i = 0; i < size - k; i++){
//             q.add(q.poll());
//         }

//         System.out.println("Queue after reversing first " + k + " elements: " + q);
//     }
// }