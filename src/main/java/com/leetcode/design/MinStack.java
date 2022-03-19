class ReversedListNode {
    private final int data;
    private ReversedListNode prev;

    ReversedListNode(int data) {
        this.data = data;
    }

    public int getData() { return data; }
    public ReversedListNode getPrev() { return prev; }
    public void setPrev(ReversedListNode prev) { this.prev = prev; }
}

class MinStack {
    private ReversedListNode listNode;
    private int minVal;
    private int stackSize;

    public MinStack() {}
    
    public void push(int val) {
        if (stackSize != 0) {
            ReversedListNode prevListNode = listNode;

            listNode = new ReversedListNode(val);
            listNode.setPrev(prevListNode);

            minVal = Math.min(minVal, val);
        } else {
            listNode = new ReversedListNode(val);
            minVal = val;
        }

        ++stackSize;        
    }
    
    public void pop() {
        if (minVal != listNode.getData()) {
            listNode = listNode.getPrev();
        } else {
            listNode = listNode.getPrev();
            setNewMinVal();
        }

        --stackSize;
    }
    
    private void setNewMinVal() {
        ReversedListNode iterator = listNode;
        
        if (iterator != null) {
            minVal = iterator.getData();

            while (iterator != null) {
                minVal = Math.min(minVal, iterator.getData());
                iterator = iterator.getPrev();
            }
        }
    }
    
    public int top() {
        return listNode.getData();
    }
    
    public int getMin() {
        return minVal;
    }
}
