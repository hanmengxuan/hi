public class OJ2 {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        int n= input.nextInt();

        long[] array=new long[n];
        for(int i=0;i<array.length;i++)
            array[i]= input.nextLong();

        long[] array2=reverse(array);

        for(int q=0;q<array2.length-1;q++){
            System.out.print(array2[q]+" ");}


        int w= array2.length-1;
        System.out.print(array2[w]);

    }

    public static long[] reverse(long[] list){
        long[] result=new long[list.length];
        for(int m=0,n=list.length-1;m< list.length;m++,n--)
            result[n]=list[m];
        return result;
    }


}
