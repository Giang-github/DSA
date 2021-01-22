
package p_3;
import java.util.Scanner;
// Library to get the value the user input from the keyboard

public class P_3 {
    
    public static void main(String[] args) {

                System.out.println("Enter the string you want to reverse : ");
                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();
                // The length of the array the user entered
                int stackSize = input.length();
                
                Stack theStack = new Stack(stackSize);
                // Push the characters the user enters into the stack
                for (int i = 0; i < input.length(); i++) {
                        char my = input.charAt(i);
                        theStack.push(my);
                } 
                
                System.out.println("The reversed chain is :");
                   // Get the value on top of the stack and delete it
                while (!theStack.isEmpty()) {
                        char my = theStack.pop();         
                        System.out.print(my);
                } 
        
        }
}
   


