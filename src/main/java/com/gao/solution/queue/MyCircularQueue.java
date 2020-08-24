package com.gao.solution.queue;

/**
 * 设计循环队列
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 * <p>
 * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 * <p>
 * 你的实现应该支持如下操作：
 * <p>
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * Front: 从队首获取元素。如果队列为空，返回 -1 。
 * Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * isEmpty(): 检查循环队列是否为空。
 * isFull(): 检查循环队列是否已满。
 *  
 * <p>
 * 示例：
 * <p>
 * MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
 * circularQueue.enQueue(1);  // 返回 true
 * circularQueue.enQueue(2);  // 返回 true
 * circularQueue.enQueue(3);  // 返回 true
 * circularQueue.enQueue(4);  // 返回 false，队列已满
 * circularQueue.Rear();  // 返回 3
 * circularQueue.isFull();  // 返回 true
 * circularQueue.deQueue();  // 返回 true
 * circularQueue.enQueue(4);  // 返回 true
 * circularQueue.Rear();  // 返回 4
 *  
 * <p>
 * 提示：
 * <p>
 * 所有的值都在 0 至 1000 的范围内；
 * 操作数将在 1 至 1000 的范围内；
 * 请不要使用内置的队列库。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/17 19:38
 **/
public class MyCircularQueue {

    private int[] queue = null;

    private int size;

    private int head = 0;

    private int tail = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        size = k;
        queue = new int[size + 1];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[(++tail) % (size + 1)] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head++;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(head +1) % (size + 1)];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[tail % (size + 1)];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        if (head % (size + 1) == tail) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        if ((tail + 1) % (size + 1) == head) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

// 设置长度为 3
// 返回 true
// 返回 true
// 返回 true
// 返回 false，队列已满
// 返回 3
// 返回 true
// 返回 true
// 返回 true
// 返回 4
//        MyCircularQueue circularQueue = new MyCircularQueue(3);
//        System.out.println(circularQueue.enQueue(1));
//        System.out.println(circularQueue.enQueue(2));
//        System.out.println(circularQueue.enQueue(3));
//        System.out.println(circularQueue.enQueue(4));
//        System.out.println(circularQueue.Rear());
//        System.out.println(circularQueue.isFull());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.enQueue(4));
//        System.out.println(circularQueue.Rear());

//        MyCircularQueue circularQueue = new MyCircularQueue(6);
//        System.out.println(circularQueue.enQueue(6));
//        System.out.println(circularQueue.Rear());
//        System.out.println(circularQueue.Rear());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.enQueue(5));
//        System.out.println(circularQueue.Rear());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.Front());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());

        //["MyCircularQueue","enQueue","Rear","Front","deQueue","Front","deQueue","Front","enQueue","enQueue","enQueue","enQueue"]
        //[[3],[2],[],[],[],[],[],[],[4],[2],[2],[3]]

        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));

    }

}

