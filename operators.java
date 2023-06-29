/**
 * operators
 */
public class operators {

    public static void main(String[] args) {
        /*
         * Operators in Java
         * operand, operator, operand = Result
         * 4 + 7 = 11
         * 
         * Types of operators in Java
         * 1. Arithmetic operators
         * 2. Assignment operators
         * 3. comparison operators
         * 4. Logical Operators
         */

        // arithmetic operators
        // + - * / % ++ --

        // int <op> int = int
        // float <op> int = float
        // int <op> float = float
        // same for double

        int num1 = 45;
        double num2 = 18;
        System.out.print("The Value of num1 + num2 = ");
        System.out.println(num1 + num2);

        System.out.print("The Value of num1 - num2 = ");
        System.out.println(num1 - num2);

        System.out.print("The Value of num1 * num2 = ");
        System.out.println(num1 * num2);

        System.out.print("The Value of num1 / num2 = ");
        System.out.println(num1 / num2);

        System.out.print("The Value of num1 % num2 = ");
        System.out.println(num1 % num2);

        System.out.print("num1 = ");
        System.out.println(num1);
        System.out.print("num1++ = ");
        System.out.println(num1++);
        System.out.print("num1 = ");
        System.out.println(num1);

        System.out.print("++num1 = ");
        System.out.println(++num1);
        System.out.print("num1 = ");
        System.out.println(num1);

        System.out.print("num1-- = ");
        System.out.println(num1--);
        System.out.print("num1 = ");
        System.out.println(num1);

        System.out.print("--num1 = ");
        System.out.println(--num1);
        System.out.print("num1 = ");
        System.out.println(num1);

        // assignment operators
        // = += -= *= /= %=

        int num3 = 17;
        System.out.println(num3);
        num3 += 12;
        System.out.println(num3);
        num3 -= 2;
        System.out.println(num3);
        num3 *= 2;
        System.out.println(num3);
        num3 /= 3;
        System.out.println(num3);
        num3 %= 13;
        System.out.println(num3);

        num3 ^= 7; // this is ^ XOR ie a bitwise operator
        System.out.println(num3);

        // comparison operator
        /*
         * 1. == -> check if values are equal
         * 2. != -> check is values are not equal
         * 3. < -> check if value is less than
         * 4. > -> check if value is greater than
         * 5. <= -> check if value is less than or equal to
         * 6. >= -> check if value is greater than or equal to
         */

        int num4 = 4;
        float num5 = 4.0f;
        float num6 = 4.01f;

        System.out.println(" ==");
        System.out.println(num4 == num5);
        System.out.println(num4 == num6);

        System.out.println(" !=");
        System.out.println(num4 != num5);
        System.out.println(num4 != num6);

        System.out.println(" <");
        System.out.println(num4 < num5);
        System.out.println(num4 < num6);

        System.out.println(" >");
        System.out.println(num4 > num5);
        System.out.println(num4 > num6);

        System.out.println(" <=");
        System.out.println(num4 <= num5);
        System.out.println(num4 <= num6);

        System.out.println(" >=");
        System.out.println(num4 >= num5);
        System.out.println(num4 >= num6);

        // Logical Operators
        /*
         * 1. && -> logical AND
         * 2. || -> logical OR
         * 3. ! -> logical NOT
         */

        System.out.print("true && true = ");
        System.out.println(true && true);

        System.out.print("true && false = ");
        System.out.println(true && false);

        System.out.print("false && false = ");
        System.out.println(false && false);

        System.out.print("true || true = ");
        System.out.println(true || true);

        System.out.print("true || false = ");
        System.out.println(true || false);

        System.out.print("false || false = ");
        System.out.println(false || false);

        System.out.print("!true = ");
        System.out.println(!true);

        System.out.print("!false = ");
        System.out.println(!false);

    }
}