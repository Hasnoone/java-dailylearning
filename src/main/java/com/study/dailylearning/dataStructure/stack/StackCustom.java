package com.study.dailylearning.dataStructure.stack;

/**

 * @description:
 * @create: 2020-04-25
 **/
public class StackCustom {

    int size;
    int[] array ;
    int top;



    StackCustom(int size) {
        this.size = size;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }



    public void push(int element) {
        if (!isFull()) {
            array[++top] = element;
        } else {
            System.out.println("Stack is full");
        }
    }


    public int pop() {
        if (!isEmpty()) {
            return array[top--];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public int peek() {
        return array[top];
    }



    //sort a stack by using another stack
    public StackCustom sortStack(StackCustom stack) {
        StackCustom tempStack = new StackCustom(10);
        while (!stack.isEmpty()) {
            int currentData = stack.pop();
            while (!tempStack.isEmpty() && currentData < tempStack.peek()) {
                stack.push(tempStack.pop());
            }
            tempStack.push(currentData);
        }

        return tempStack;
    }


    public  void printStack(StackCustom stack)
    {
        if(top>=0)
        {
            System.out.println("Elements of stacks are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i]);
            }
        }

    }


    public static void main(String[] args) {
        StackCustom stackCustom = new StackCustom(10);
        System.out.println("=================");
        stackCustom.push(10);
        stackCustom.push(30);
        stackCustom.push(50);
        stackCustom.push(40);
        stackCustom.printStack(stackCustom);
        StackCustom sortedStack=stackCustom.sortStack(stackCustom);
        System.out.println("=================");
        System.out.println("After Sorting :");
        System.out.println("=================");
        sortedStack.printStack(sortedStack);

    }


}

