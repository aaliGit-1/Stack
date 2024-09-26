//Stack implementation using ArrayList
import java.util.*;
public class StackALL {
    static class StackA{
    	static ArrayList<Integer> list =new ArrayList<>();
    	public static boolean isEmptyStack() {
    		return list.size()==0;
    	}
    	public static void pushStack(int data) {
    		list.add(data);
    	}
    	public static int popStack() {
    		int top=list.get(list.size()-1);
    		list.remove(list.size()-1);
    		return top;
    	}
    	public static int peekStack() {
    		return list.get(list.size()-1);
    	}
    	
    }
    //Q1: Push the element at the bottom of the stack
	public static void pushAtBottom(int d, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
			return;
		}
		int top=s.pop();
		pushAtBottom(d,s);
		s.push(top);
	}
	//Q2: Reverse the stack
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reverseStack(s);
		pushAtBottom(top,s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackA st =new StackA();
        st.pushStack(10);
        st.pushStack(20);
        st.pushStack(30);
        st.pushStack(40);
        System.out.println("Elements in the Stack using ArrayList are: ");
        while(!st.isEmptyStack()) {
        	System.out.println(st.peekStack());
        	st.popStack();
        }
        //using Java Collection framework to implement Stack
        Stack<Integer> s=new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        pushAtBottom(500,s);
        reverseStack(s);
        System.out.println("Elements in the Stack using Collection Framework are: ");
        while(!s.isEmpty()) {
        	System.out.println(s.peek());
        	s.pop();
        }
        
        
	}

}
