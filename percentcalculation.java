import java.util.Scanner;

public class percentcalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        float a = sc.nextInt();
        System.out.println("enter your marks");
       float b = sc.nextInt();
       System.out.println("enter your marks");
       float c = sc.nextInt();
       System.out.println("enter your marks");
       float d = sc.nextInt();
        System.out.println("enter your marks");
        float e = sc.nextInt();

        float totalmark = a+b+c+d+e;
       System.out.println(totalmark);
        float percentage = (totalmark/500)*100;
        System.out.println(percentage);
    }
    
}
