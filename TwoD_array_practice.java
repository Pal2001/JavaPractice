import java.util.Scanner;

public class TwoD_array_practice {

    public static void main(String[] args) {

        // Scanner sc =new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // int [][] matrix = new int [row][col];
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Scanner sc =new Scanner(System.in);
        // int row = sc.nextInt();
        // int colm = sc.nextInt();
        // int [][] myint = new int[row][colm];
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<colm; j++){
        //         myint[i][j] = sc.nextInt();
        //     }
        // }
        // int x = sc.nextInt();
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<colm; j++){
        //         if( myint[i][j] == x ){
        //             System.out.println("x is present at position (" + i + "," + j + ")");
        //         }
        //     }
            
        // }

        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int [][] matrix = new int[row][colm];
        for(int i=0; i<row; i++){
            for(int j=0; j<colm; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int row_start=0;
        int row_end=row-1;
        int colm_start=0;
        int colm_end=colm-1;
        for(int i=0; i>=row_start; i++){
            for(int j=0; j<colm_end; j++){
                
                System.out.print(matrix[i][j]);
                
            }
        }    
        
    }
    
}
