
import java.util.Scanner;

public class DemoTutorial {

    public static void main(String[] args) {
        
        
        // Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();
        // int b = sc.nextInt();
        // String op = sc.next();
        // switch(op){
        //     case "+": System.out.println(a+b);
        //     break;
        //     case "-": System.out.println(a-b);
        //     break;
        //     case "*": System.out.println(a*b);
        //     break;
        //     case "/": System.out.println(a/b);
        //     break;
        //     case "%": System.out.println(a%b);
        //     break;
        //     default : System.out.println("invalid operator");
        
        // for loop

        // for (int i=0; i<11; i++){
        //     System.out.println(i);
        // }

        // while loop

        // int i=0;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }

        // do while Loop

        // int i=0;
        // do{
        //     System.out.println(i); // first it will execute then check condition
        //     i++;
        // } while(i<11);

        // practice question1

        // int sum=1;
        // for(int b=1  ; b<=10; b++ ){
            
        //      sum = sum +b;  
        // }
        // System.out.println(sum);

        //practice question2

        // for(int i=1; i<=a;i++){
        //     if (i%2==0){
        //         System.out.println(i + " ");
                

        //     }
            
        // }

        // practice question 3

        // for (; ;){
        //     System.out.println("hey mike");
        // }

        // practice question 4

        
            // System.out.println("Enter value 0 or 1 : ");
        //      Scanner sc =new Scanner(System.in);
        //      int input;
             
            
        // do {
        //     int val=sc.nextInt();
        //     if(90<=val && val<=100){
        //         System.out.println("This is Good");
        //     } else if(89>=val && 60<=val){
        //         System.out.println("This is Also Good");
        //     }
        //     else if(59>=val && 0<=val){
        //         System.out.println("This is Good as well");
        //     } else{
        //         System.out.println("Invalid ");
        //     }
        //     System.out.println("Want to contineu? (yes)enter '1' or (no) enter '0'");  
        //     input = sc.nextInt();  
        // } while (input==1);

        // switch case practise

        // Scanner sc=new Scanner(System.in);
        // int num= sc.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("january");
        //         break;

        //     case 2:
        //         System.out.println("february");
        //         break;

        //     case 3:
        //         System.out.println("march");
        //         break;

        //     case 4:
        //         System.out.println("april");
        //         break;

        //     case 5:
        //         System.out.println("may");
        //         break;

        //     case 6:
        //         System.out.println("june");
        //         break;

        //     case 7:
        //         System.out.println("july");
        //         break;

        //     case 8:
        //         System.out.println("august");
        //         break;

        //     case 9:
        //         System.out.println("september");
        //         break;

        //     case 10:
        //         System.out.println("october");
        //         break;

        //     case 11:
        //         System.out.println("november");
        //         break;

        //     case 12:
        //         System.out.println("december");
        //         break;

        //     default:
        //         System.out.println("invalid input");
        //         break;
        // }

        // pattern problems

        // for (int i=0;i<=3;i++){
            
        //     for(int j=1; j<=5; j++){

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++){
        
        //     for (int j=1; j<=5; j++){
        //         if ( i==1 || i==4 ||j==1 || j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i=4; i>=1;i--){
        //     for (int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=4; i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for (int i=5; i>=1; i--){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }

         
        // int num=1;
        // for(int i=1;i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++ ){
        //         int sum = i+j;
        //         if(sum%2==0){
        //             System.out.print("1" + " ");
        //         } else{
        //             System.err.print("0" + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // practice question pattern

        // 1st question

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1 ;j<=5; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // 2nd question

        // for (int i=1; i<=5; i++){
        //     for(int j=1;j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // int num=1;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i+1; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // Advance pattern problems

        // for (int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(4-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=2*(4-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i =1; i<=5; i++){
        //     for (int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++){
        //     for(int j=1 ; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=4; i>=1; i--){
        //     for(int j=1 ; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // practice problem 1


        // for (int i=1; i<=4; i++){
        //         for(int j=1; j<=i; j++){
                    
        //             if(i==1 || j==1 || i==j){
        //                 System.out.print("*");

        //             }else{
        //                 System.out.print(" ");
        //             }
                   
        //         }
        //         for(int j=1; j<=2*(4-i); j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1; j<=i; j++){
        //             if(i==1 || j==1 || i==j){
        //                 System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             }
                    
        //         }
        //         System.out.println();
        //     }
        //     for (int i=4; i>=1; i--){
        //         for(int j=1; j<=i; j++){
                    
        //             if(i==1 || j==1 || i==j){
        //                 System.out.print("*");

        //             }else{
        //                 System.out.print(" ");
        //             }
                   
        //         }
        //         for(int j=1; j<=2*(4-i); j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1; j<=i; j++){
        //             if(i==1 || j==1 || i==j){
        //                 System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             } 
        //         }
        //         System.out.println();
        //     } 
        
        //  practice problem 2

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         if(i==1 ||i==n || j==1 || j==n){
        //             System.out.print("*");

        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }

        // practice problem 4

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // practice problem 3

        

        



    }
    
}
