public class sort_method_practise {

    public static void printArray(int [] a2){
        for(int i=0; i<a2.length; i++){
            System.out.print(a2[i] + " ");
        }
    }

    public static void main (String args[]){
        int[] a1={3,2,4,1,6,5};
       // System.out.println(a1[1]);

        // bubble sort

        // for (int i=0; i<a1.length-1; i++){
        //     for(int j=0; j<a1.length-i-1; j++){
        //         if(a1[j]>a1[j+1]){
        //             int temp=a1[j];
        //             a1[j]=a1[j+1];
        //             a1[j+1]=temp;
        //         }
        //     }
        // } 

        // selection sort

        // for (int i=0; i<a1.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1; j<a1.length;j++){
        //         if(a1[smallest]>a1[j]){
        //             smallest = j; 
        //         }  
        //     }
        //     int temp = a1[smallest];
        //     a1[smallest]=a1[i];
        //     a1[i]=temp;
        // }

        // insertion sort

        // for (int i=1; i<a1.length-1;i++){
        //     int current = a1[i];
        //     int j = i-1;
        //     while(j>=0 && current < a1[j]){
        //         a1[j+1]=a1[j];
        //         j--;
        //     }
        //     a1[j+1]=current;
        // }
        printArray(a1);
    }
    
}
