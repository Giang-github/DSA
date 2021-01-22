
package p_3;
import java.util.Scanner;


public class P_3 {
    
    public static void main(String[] args) {
//Lấy giá trị người dùng nhập vào từ bàn phím
                System.out.println("Nhập chuỗi bạn muốn đảo ngược : ");
                Scanner scan = new Scanner(System.in);
                String input = scan.nextLine();
                // Độ dài của mảng người dùng nhập vào
                int stackSize = input.length();
                
                Stack theStack = new Stack(stackSize);
                // Đẩy các kí tự người dùng nhập vào trong stack
                for (int i = 0; i < input.length(); i++) {
                        char my = input.charAt(i);// đẩy vào kí tự thứ index
                        theStack.push(my);
                } 
                
                System.out.println("Chuỗi bị đảo ngược là:");
                    // Lấy ra giá trị trên đỉnh của stack và xóa nó đi
                while (!theStack.isEmpty()) {
                        char my = theStack.pop();         
                        System.out.print(my);
                } 
        
        }
}
   


