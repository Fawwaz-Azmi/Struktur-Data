package Modul3_Latihan_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLibrary {
    public void queueExample(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove : "+queue.remove());
        System.out.println("element : "+queue.element());
        System.out.println("poll : "+queue.poll());
        System.out.println("peek : "+queue.peek());
        System.out.println("Data Sekarang : "+queue);
    }


    public static void main(String[] args) {

        new QueueLibrary().queueExample();
    }
}

