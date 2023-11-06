package uk.ac.cam.rd722.supo1;

// question 6
public class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int val) {
        value = val;
    }

    public void append(int val) {
        if (next == null) next = new LinkedList(val);
        else next.append(val);
    }

    public boolean remove(int val) throws Exception {
        if (value == val) throw new Exception("Cannot remove head element");
        else if (next == null) return false;
        else if (next.value == val) {
            next = next.next;
            return true;
        } else return next.remove(val);
    }

    public int head() {
        return value;
    }

    public int index(int i) throws Exception {
        if (i < 0) throw new Exception("Index out of range");
        if (i == 0) return value;
        else return next.index(i-1);
    }

    public int length() {
        if (next == null) return 0;
        else return 1 + next.length();
    }

    // question 7
    public boolean detectCycle() {
        if (next == null) return false;
        LinkedList comp = next;
        while (comp != null) {
            if (this == comp) return true;
            else comp = comp.next;
        }
        return next.detectCycle();
    }
}
