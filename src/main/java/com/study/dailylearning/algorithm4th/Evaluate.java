package com.study.dailylearning.algorithm4th;

import java.util.Stack;

/**
 * 双栈算术表达式求值
 * 使用两个队列来计算一个表达式的值
 */
public class Evaluate {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        String expression = "(1+((2+3)*(4*5)))";
        char[] charArr = expression.toCharArray();
        for (char item : charArr) {
            String s = String.valueOf(item);
            if (item == '(') {
                System.out.println(item);
            }else if (s .equals("+")||s .equals("-")||s .equals("*")||s .equals("/")||s .equals("sqrt")) {
                ops.push(String.valueOf(item));
            }else if (item == ')') {
                String op = ops.pop();
                double value = vals.pop();
                if (op.equals("+")) {
                    value = vals.pop() + value;
                }
                if (op.equals("-")) {
                    value = vals.pop() - value;
                }
                if (op.equals("*")) {
                    value = vals.pop() * value;
                }
                if (op.equals("/")) {
                    value = vals.pop() / value;
                }
                if (op.equals("sqrt")) {
                    value = Math.sqrt(value);
                }
                vals.push(value);
            }else {
                vals.push(Double.parseDouble(String.valueOf(item)));
            }

        }
        System.out.println(vals.pop());
    }
}
