public class OJ22 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int t = input.nextInt();
        int n ;
        String www="heeee";


        for (int i = 0; i < t; i++) {
            n = input.nextInt();
            long[][] a = new long[n][n];
            for (int q= 0; q< n;q++) {
                for (int j = 0; j <n; j++)
                    a[q][j] = input.nextLong();
            }
            String b = Symmetric(a);
            System.out.println(b);
        }


    }

    public static String Symmetric(long[][] array) {

        String a="Y";
        String b="N";

        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array[i].length;j++) {
                if (array[i][j] != array[j][i])
                    return b;

            }
        }
        return a;
    }
}

