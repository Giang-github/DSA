
package p_3;
public class Stack {
   //Declare 
    public int maxSize;
    public char[] stackArray;
    public int top;
   public Stack(int max) {
      maxSize = max;
      stackArray = new char[maxSize];
      top = -1; 
   } 
  // Add a value to the stack
   public void push(char i) {
      stackArray[++top] = i;
   } 
  // Get the value on top and delete it
   public char pop() {
      return stackArray[top--];
   } 
   // Get the top value without deleting it
   public char top() {
      return stackArray[top];
   } 
   // Returns true if the stack is empty, else returns false
   public boolean isEmpty() { 
      return (top == -1);
   } 
   // Returns true if the stack is full, else returns false.
   public boolean isFull() {
      return (top == maxSize - 1);
   }
}
