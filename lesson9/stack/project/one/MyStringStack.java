package lesson9.stack.project.one;

public class MyStringStack {

	private MyStringLinkedList myStringList;
	private int top;

	public MyStringStack() {

		myStringList = new MyStringLinkedList();
		top = 0;

	}

	void push(String s) {
		
		if(top == 0) {
			myStringList.add(s);
		}
		else
			myStringList.insert(s, top++);
		
	}

	String pop() {

		String result = myStringList.get(--top);
		if(myStringList.remove(result)) {
			return result;
		}
			
		return null;

	}

	String peek() {
		return myStringList.get(--top);

	}

	public static void main(String[] args) {

		MyStringStack stack = new MyStringStack();
		stack.push(" Bob ");
		stack.push(" Harry ");
		stack.push(" Alice ");
		System.out.println(" Popping… " + stack.pop());
		System.out.println(" Peeking…. " + stack.peek());
		System.out.println(" Popping… " + stack.pop());

	}

}
