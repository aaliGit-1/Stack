//Stack Implementation using LinkedList
public class StackLL {
	
	static class Node{
		int data;
		Node next;
		Node(int d){//constructor
			this.data=d;
			next=null;
		}
	}
	static class Stack{
		//to access the same head node everywhere
		public static Node head;
		//isEmpty condition
		public static boolean isEmpty() {
			return head==null;
		}
		public static void push(int data) {//push operation
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int popEle=head.data;
			head=head.next;
			return popEle;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
	    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s1=new Stack(); 
        s1.push(1);
        s1.push(2);
        s1.push(3);
        //printing the elements till it the stack gets empty
        System.out.println("Elements in the stack are: ");
        while(!s1.isEmpty()) {
        	System.out.println(s1.peek());
        	s1.pop();
        }
	}

}
