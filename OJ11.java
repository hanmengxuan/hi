public class OJ11<q> {
    public static void main(String[] args) {


        java.util.Scanner input = new java.util.Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int x = input.nextInt();
        int y = input.nextInt();

        int[][] map = new int[n][m];


        for (int i= 0; i< n; i++) {
            for (int j = 0; j < m; j++)
                map[i][j] = input.nextInt();
        }

        int a=(k-1)/2;
        int counter=0;

        for(int i=x-a;i<=x+a;i++) {
            if (i < 0)
                continue;
            if (i > n - 1)
                continue;
            for (int j = y - a; j <=y + a; j++) {
                if (j < 0)
                    continue;
                if (j > m - 1)
                    continue;
                if (map[i][j] == 1)
                    counter++;

            }

        }
System.out.println(counter);
    }
}