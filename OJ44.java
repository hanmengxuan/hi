import java.util.Objects;

public class OJ44 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int[][] array = new int[n][m];

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 2) {
                    x = i;
                    y = j;
                }
            }
        }

        String ins;

        for(int i=0;i<k;i++) {
            ins = input.next();
            if (Objects.equals(ins, "R")) {
                if (y + 1 < m) {
                    if (array[x][y + 1] == 0) {
                        array[x][y] = 0;
                        y = y + 1;
                    }
                }
                continue;
            }
            if (Objects.equals(ins, "L")) {
                if (y - 1 > -1) {
                    if (array[x][y - 1] == 0) {
                        array[x][y] = 0;
                        y = y - 1;
                    }
                }
                continue;
            }
            if (Objects.equals(ins, "U")) {
                if (x - 1 > -1) {
                    if (array[x - 1][y] == 0) {
                        array[x][y] = 0;
                        x = x - 1;
                    }
                    }
                    continue;
                }

            if (Objects.equals(ins, "D")) {
                if (x+1 <n) {
                    if (array[x + 1][y] == 0) {
                        array[x][y] = 0;
                        x = x + 1;
                    }
                }
                continue;
            }
        }
        System.out.print(x+" "+y);

    }
}
