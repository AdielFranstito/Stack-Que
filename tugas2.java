import java.util.LinkedList;
import java.util.Queue;

public class tugas2 {
    public void queueExample(){
        Queue que = new LinkedList();
        que.add("Java");
        que.add("DotNet");
        que.offer("PHP");
        que.offer("HTML");
        System.out.println("Remove : "+que.remove());
        System.out.println("Element : "+que.element());
        System.out.println("poll : "+que.poll());
        System.out.println("peek : "+que.peek());

    }

    public static void main(String[] args) {
        new tugas2().queueExample();
    }
}
