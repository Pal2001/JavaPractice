class aarymaxsumminsumdif{

    public static void main(String[] args) {
        int a[]= {1,2,4,5,7,8,3};
        int m=3;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
                
            }
        }
        for(int k=0; k<a.length; k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
        int min=0;
        int max=0;
        for(int j=0; j<m; j++){
            min = min + a[j]; 
        }
        for(int l=a.length-1; l>m; l--){
            max= max + a[l];
        }
        System.out.println(max-min);

    }
}