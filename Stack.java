/*
 * Brief program description:Top is used as a pointer. We are not removing things from these arrays. Rather we are pointing
 * to different index values or cells from the top down. To maintain the value that is considered to be the top value
 * on the stack. 
 * Point to cells and then we are overwriting 
 * pop reduces the pointer by -1, pointing to an index -1
 * push adds +1 pointer, pointing to an index +1
 * 
 * Use if and else statements to throw exceptions
 */
package ds.stack;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top; // index position of the last item placed on the stack
	
	// initialize data structure with constructor
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1; //represents the item's position, place -1 because there is nothing currently there, 0 is the first item.
		/*
		 * top variable represents the items position
		 * 0 is the first item in an array, but nothing is currently there
		 * thus we declare it as -1, so that our index will not be off
		 */
		}
		//places new index item a top the stack
		public void push(char j) {
			if(isFull()) {
				System.out.println("this stack is already full"); 
			}else {
				top++;
				stackArray[top] = j; //assigns stack array with that index position with value passed into it
			}
		}
		
		//remove something from the stack, returns
		public char pop() {
			if(isEmpty()) {
				System.out.println("the stack is already empty");
				return '0'; // both need to return, -1 means empty
			}else {
				int old_top = top;
				top--;
				return stackArray[old_top];//stores this item into old_top
			}
		}
		
		//let's user see what is a top
		public long peak(){
			return stackArray[top];
		}
		
		//
		public boolean isEmpty() {
			return (top == -1);
		}
		
		//
		public boolean isFull() {
			return (maxSize-1 == top); // -1 because we start with zero
		}
}
