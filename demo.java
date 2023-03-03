import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        for (int i=1;i<11;i++){
           System.out.print("*");
           
            if ( i==4 || i==7 || i==9 || i==10){
                System.out.println("");              
                
            }
         //   else if( i==7 || i==10 || i==11 || i==14 || i==15 || i==16){
         //       System.out.print( " ");
         //   }
         }
        int a= 20;
        int b = 5;
        int c = 70;
        a %= 2;
        b =+ 3;
        c /= 5;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);   
        System.out.println(Math.sqrt(36));
        System.out.println(Math.random());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int d = sc.nextInt();
        

        if (d>20) {
            System.out.println("you are an adult");
        }
        else if (d>5){
            System.out.println("you are not a kid");
        }
        else {
            System.out.println("you are a kid");
        }
        
        
    }




}