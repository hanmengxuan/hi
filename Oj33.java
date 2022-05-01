public class Oj33 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();

        char[][] array=new char[n][m];

        String a;
        for (int i= 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                a = input.next();
                array[i][j] =a.charAt(0);
            }
        }


        for (int i= 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] != 'X')
                    continue;
                if (array[i][j - 1] == array[i][j + 1])
                    array[i][j] = array[i][j + 1];
                if (array[i][j - 1] == 'R') {
                    if (array[i][j + 1] == 'Y')
                        array[i][j] = 'O';

                    if (array[i][j + 1] == 'B')
                        array[i][j] = 'P';
                }
                if (array[i][j - 1] == 'Y') {
                    if (array[i][j + 1] == 'R')
                        array[i][j] = 'O';

                    if (array[i][j + 1] == 'B')
                        array[i][j] = 'G';
                }
                if (array[i][j - 1] == 'B') {
                    if (array[i][j + 1] == 'R')
                        array[i][j] = 'P';

                    if (array[i][j + 1] == 'Y')
                        array[i][j] = 'G';
                }

            }

        }
        for (int i= 0; i< n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(array[i][j]+" ");
                System.out.println();
            }
        }
    }
