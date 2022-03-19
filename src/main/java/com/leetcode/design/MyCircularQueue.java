package com.leetcode.design;

public class MyCircularQueue {
    private final int[] data;
    private final int capacity;
    private int size;
    private int head;
    private int tail;

    public MyCircularQueue(int k) {
        data = new int[k];
        capacity = k;
        size = 0;
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            ++head;
        }

        ++size;

        tail = tail < capacity - 1 ? tail + 1 : 0;

        data[tail] = value;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        --size;

        if (isEmpty()) {
            head = -1;
            tail = -1;
        } else {
            head = head < capacity - 1 ? head + 1 : 0;
        }

        return true;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }

        return data[head];
    }

    public int rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
