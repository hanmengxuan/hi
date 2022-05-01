import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        ArrayList<String> list=new ArrayList<>();
        StringBuilder builder=new StringBuilder();

        for(int i=0; input.hasNext();i++) {
            builder = new StringBuilder(input.nextLine());
            if (builder.charAt(6) == '-')
                builder.insert(5, 0);
            if (builder.length() < 10)
                builder.insert(8, 0);

            String a = builder.toString();
            list.add(a);
        }
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i< list.size();i++)
            list2.add(list.get(i));


        Collections.sort(list2);

        int n;

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<list.size();i++) {
            n = list.indexOf(list2.get(i));
            list.set(n, "");
            ans.append(n);
        }
        System.out.println(ans);

    }
}
