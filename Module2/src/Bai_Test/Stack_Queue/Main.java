package Bai_Test.Stack_Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<String>();
        strings.push("cong");
        strings.push("hoa");
        strings.push("xa");
        strings.push("hoi");
        strings.push("chu");
        strings.push("nghia");
        strings.push("viet");
        strings.push("nam");

        System.out.println(strings);

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.offer("1");
        priorityQueue.offer("2");
        priorityQueue.offer("3");
        priorityQueue.offer("4");
        priorityQueue.offer("5");
        priorityQueue.offer("6");

    }
}
