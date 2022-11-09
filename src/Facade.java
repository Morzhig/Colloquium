import java.util.Scanner;

public class Facade {
    String result;
    public int wrong(){
        Scanner in = new Scanner(System.in);

        int tmp;

        System.out.println("Do you want to concatenate 2 strings(1) or multiply 1 string(2): ");

        tmp = in.nextInt();

        while(tmp < 1 || tmp > 2){
            tmp = wrong();
        }

        return tmp;
    }

    public Facade() {
        Scanner in = new Scanner(System.in);

        int tmp;

        System.out.println("Concatenate(1) or multiply(2)");

        tmp = in.nextInt();

        if(tmp < 1 || tmp > 2)
            tmp = wrong();

        if(tmp == 1) {
            String s1;
            String s2;

            s1 = in.nextLine();
            s2 = in.nextLine()
            ;
            result = new String_String().cat();
        }

        else {
            String s1;
            int n;

            s1 = in.nextLine();
            n = in.nextInt();

            result = new String_String().mulcat();
        }
    }
}