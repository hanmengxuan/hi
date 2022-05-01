import java.util.Objects;

public class OJ111 {
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);

        String a= input.nextLine();
        int counter=1;

        String[] array=a.split("");

        if(array.length==1)
            System.out.print(array[0]);


        for(int i=1;i< array.length;i++) {
            if(array[i].equals(array[i-1])){
                counter++;
                if(i== array.length-1)
                    System.out.print(array[i]+counter);

            }
            else{
                if(counter>1)
                System.out.print(array[i-1]+counter);
                else
                    System.out.print(array[i-1]);
                counter=1;
                if(i== array.length-1)
                    System.out.print(array[i]);
            }

        }
    }

}


