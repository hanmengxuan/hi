public class Oj222 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        long n = input.nextInt();
        if(n==0)
            System.out.println("False");


        String c;
        for (long i = 1; i <= n; i++) {
            String a = input.next();
            boolean b=Password(a);
            if (b)
                c = "True";
            else c = "False";
            System.out.println(c);

        }
    }
    public static boolean Password(String a) {
        if (a.length() < 8)
            return false;
        if (a.length() > 15)
            return false;

        int s = 0, d = 0, f = 0, g = 0;

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLowerCase(a.charAt(i)))
                s++;
            if (Character.isUpperCase(a.charAt(i)))
                d++;
            if (Character.isDigit(a.charAt(i)))
                f++;



            boolean q = Character.isLowerCase(a.charAt(i));
            boolean w = Character.isUpperCase(a.charAt(i));
            boolean e = Character.isDigit(a.charAt(i));

            if (!q && !w&&!e) {
                if(a.charAt(i)=='#')
                g++;
                if(a.charAt(i)=='$')
                g++;
                if(a.charAt(i)=='^')
                g++;
                if(a.charAt(i)=='*')
                g++;
                if(a.charAt(i)=='&')
                g++;
            }
        }
        if (s == 0)
            return false;
        if (d == 0)
            return false;
        if (f == 0)
            if (g == 0)
            return false;

        String[] array = a.split("");
        for (int i = 1; i < array.length - 1; i++) {
            if (Character.isLetterOrDigit(a.charAt(i))) {
                if (array[i - 1].equals(array[i]))
                    if (array[i + 1].equals(array[i]))
                        return false;
            }
        }
return true;

    }
    }

