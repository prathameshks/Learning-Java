import java.util.*;

public class input_in_java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Input :");
        String i = scan.nextLine(); // read complete Line with whitespace
        System.out.println(i);
        /*
         * Enter Input :This is a line
         * This is a line
         */

        System.out.print("Enter Word :");
        String j = scan.next();
        System.out.println(j);
        /*
         * Enter Word :this is line
         * this
         */

        System.out.print("Enter Age :");
        int k = scan.nextInt();
        System.out.println(k);
        /*
         * Enter Age :12
         * 12
         */

        System.out.print("Enter Percentage :");
        Float l = scan.nextFloat();
        System.out.println(l);
        /*
         * Enter Percentage :123.36
         * 123.36
         */

        scan.close();
    }
}
