package com.argsno.interview.Design.MinStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
