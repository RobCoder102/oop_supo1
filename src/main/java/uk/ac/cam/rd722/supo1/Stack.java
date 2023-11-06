package uk.ac.cam.rd722.supo1;

// question 9
public class Stack {
    public int capacity;
    public int[] arr;
    public int count;

    public Stack(int size) {
        capacity = size;
        arr = new int[size];
        count = 0;
    }

    public void push(int item) throws Exception {
        if (count >= capacity) throw new Exception("Cannot append to full stack");
        else {
            count++;
            arr[count] = item;
        }
    }

    public int pop() throws Exception {
        if (count <= 0) throw new Exception("Cannot pop from empty stack");
        else {
            // leave item in the array, it will be written over later if stack fills up
            count--;
            return arr[count];
        }
    }

    public int peek() throws Exception {
        if (count <= 0) throw new Exception("Cannot peek into empty stack");
        else return arr[count];
    }

}
