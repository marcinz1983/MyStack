package Stack;

class Main {
    public static void main(String args[]) {

        MyStack stack = new MyStack(10);
        stack.push(55);
        stack.push(70);
        System.out.println("Value taken from stack :  "+ stack.pop());
        stack.printStack();
        stack.push(15);
        stack.push(25);
        stack.push(80);
        System.out.println("Value taken from stack :  "+ stack.pop());
        stack.printStack();
        System.out.println("The min value in the stack :"+ stack.peekMin());
    }

}