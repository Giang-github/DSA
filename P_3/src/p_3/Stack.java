
package p_3;
public class Stack {
    //Khai báo 
    public int maxSize;
    public char[] stackArray;
    public int top;
   public Stack(int max) {
      maxSize = max;
      stackArray = new char[maxSize];
      top = -1; 
   } 
   // Thêm một giá trị vào trong stack
   public void push(char i) {
      stackArray[++top] = i;
   } 
   // Lấy ra giá trị trên đỉnh và xóa nó đi
   public char pop() {
      return stackArray[top--];
   } 
   // Lấy ra giá trị trên đỉnh mà không xóa nó đi
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
