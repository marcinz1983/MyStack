package Stack;

class MyStack {
    private int[] stockArray;
    private int head = -1;
    private final int arrayMaxSize;

    public MyStack(int arraySize) {
        this.arrayMaxSize = arraySize;
        this.stockArray = new int[arraySize];
    }

    public boolean push(int value) {
        if (head >= (arrayMaxSize - 1)) {
            System.out.println("does not add value : " + value + " to the stack because stack is overflow");
            return false;
        } else {
            stockArray[++head] = value;
            //System.out.println("value: " + value + " was pushed to stack");
            return true;
        }
    }

    public int pop() {
        if (head < 0) {
            throw new IllegalStateException("stack is empty");
        } else {
            return stockArray[head--];
        }
    }

    public int peekMin() {
        for (int i = 0; i < head; i++) {
            for (int j = 0; j < head - 1; j++) {
                if (stockArray[j] > stockArray[j + 1]) {
                    int temporaryValue = stockArray[j];
                    stockArray[j] = stockArray[j + 1];
                    stockArray[j + 1] = temporaryValue;
                }
            }
        }
        return stockArray[0];
    }

    public void printStack() {
        System.out.print("Print contents of the stack : ");
        for (int i = head; i > -1; i--) {
            System.out.print(stockArray[i] + " , ");
        }
        System.out.println();
    }
}


