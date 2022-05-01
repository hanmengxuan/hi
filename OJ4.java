public class OJ4 {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        int n= input.nextInt();

        int[] array=new int[n];
        for(int i=0;i<array.length;i++)
            array[i]= input.nextInt();

        int[] array2=max(array);


        long a=0,c=0,d,b;

        for(int q=0;q<n;q++)
            if(array2[q]<0) {
                a++;
            }


        if(array2[n-1]==0){
            System.out.print(c);}


        if(a<2){
            d=array2[n-2]*array2[n-3]*array2[n-1];
            System.out.print(d);}


        if(a>=2){
          b=array2[0]*array2[1]*array2[n-1];
            d=array2[n-2]*array2[n-3]*array2[n-1];
            if(b>=d)
            System.out.print(b);
            else
                System.out.print(d);
        }






    }
    public static int[] max(int[] list) {
        int temp;

        for (int w = 0; w < list.length - 1; w++) {
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] >= list[j + 1]) {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;

                }
        }
        return list;

    }
    }







