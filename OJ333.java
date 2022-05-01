public class OJ333 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n= input.nextInt();

        if(n==0)
            System.out.println("0");


       if(n>0&&n<=50) {
            long[] array = new long[n + 1];
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < array.length; i++)
                array[i] = array[i - 1] + array[i - 2];

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i <= n; i++)
                builder.append(array[i]);

            System.out.println(builder);

        }
    }
}
