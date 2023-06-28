/**
 * first
 */
public class variables {
    public static void main(String[] args) {
        /*
         * In Java:
         * Variables are containers which store data values
         * String, int, float, char, boolean
         * 
         * Rules for constructing name of variables in Java
         * 1. Can contain digits, underscores, dollar signs, letters
         * 2. Should begin with a letter, $ or _
         * 3. Java is case sensitive language which means that harry and Harry are two
         * different variables altogether.
         * 4. Should not contain whitespace
         * 5. You cannot use reserved keywords from Java like static class public etc
         */
        String name = "Prathamesh";
        int age = 19, x = 1;
        float percnt = 96.201f;
        double a = 12.342;
        boolean b = true;
        boolean d = false;
        char c = 'x';
        byte e = -56; // -127 to 127

        System.out.println(name);
        System.out.println(age + x);
        System.out.println(percnt);
        System.out.println(a - e);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /*
         * Two types of Java Data Types:
         * 
         * 1. Primitive -byte (1 byte), short (2 bytes), intl(4 bytes),long (8 bytes),
         * float(4 bytes), double (8 bytes), boolean(l bit), char (2 bytes).
         * 2. Non IPrimitive or Reference Data Type -
         * String, Data Types defined by user
         */
    }

}
