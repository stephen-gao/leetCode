package com.gao.solution.design;

import java.util.Stack;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * <p>
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * <p>
 * <p>
 * 提示：
 * <p>
 * pop、top 和 getMin 操作总是在 非空栈 上调用
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/17 15:37
 **/
public class MinStack {


    private Stack<Integer> stack = new Stack();
    private Stack<Integer> minStack = new Stack();


    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()){
            minStack.push(x);
        }else {
            Integer preMin = minStack.peek();
            if(preMin > x){
                minStack.push(x);
            }else {
                minStack.push(preMin);
            }
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public Integer top() {
        Integer peek = stack.peek();
        return peek;
    }

    public Integer getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        s.push(5);
        s.push(-1);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());
        s.pop();
        s.pop();
        System.out.println(s.top());
        System.out.println(s.getMin());
    }

}
