import java.util.Scanner;

public class calulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fist value : ");
        int num1 = sc.nextInt();
        System.out.println("Enter operator : ");
        String op = sc.nextLine();
        System.out.print("Enter second value : ");
        int num2 = sc.nextInt();
       
        //int op = sc.nextInt();
        if (op.equalsIgnoreCase("+")) {
            System.out.println(num1 + num2);
        }
        else if (op.equalsIgnoreCase("-")){
            System.out.println(num1 - num2);
        } 
        else if (op.equalsIgnoreCase("*")) {
            System.out.println(num1 * num2);
            
        }
        else if (op.equalsIgnoreCase("/")) {
            System.out.println(num1 / num2);
        }
        else {
            
            System.out.println("Enter a operator");}
 
        


    }
    
}
