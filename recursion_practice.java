public class recursion_practice {

    // public static void printnum(int n ,int  i, int sum){
    //     if(i==n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printnum(n, i+1, sum);
        
    // }

    public static int factorial(int n ){
        if(n==1 || n==0){
            return 1;
        }
        int a = factorial(n-1);
        int fact = n*a;
        return fact;
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println(factorial(5));
    }
    
}
