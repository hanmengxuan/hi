public class OJ3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        long b = input.nextLong();

        if (b >= 0) {
            long a=b;
            while (a % 10 == 0)
                a = a / 10;

            while (a != 0) {
                long c = a % 10;
                a = a / 10;

                System.out.print(c);
            }

        }

        else {
            long a = -b;
            System.out.print("-");
            while (a % 10 == 0)
                a = a / 10;

            while (a != 0) {
                long c = a % 10;
                a = a / 10;

                System.out.print(c);
            }

        }


    }






}
