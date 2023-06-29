public class string_operations {
    public static void main(String[] args) {
        String name = "Prathamesh";
        String org = "MESCOE";

        // Concatenation
        System.out.println(name + " from " + org); // concatenate name, " from ", and org

        // Length of String
        System.out.println("Name Length = " + name.length()); // get the length of the name string

        System.out.println(name);
        System.out.println(name.toUpperCase()); // convert name to uppercase
        System.out.println(name.toLowerCase()); // convert name to lowercase

        // Escape Sequence
        System.out.println("\"" + name + "\""); // add double quotes around name
        System.out.println("Start" + "\\" + "End"); // add a backslash between Start and End
        System.out.println("Start" + "\t" + "End"); // add a tab between Start and End
        System.out.println("Start" + "\n" + "End"); // add a new line between Start and End
        System.out.println("Start" + "\'" + "End"); // add a single quote between Start and End

        // string methods
        System.out.println(name.contains("at")); // check if name contains the substring "at"
        System.out.println(name.contains("aT")); // check if name contains the substring "aT"

        System.out.println(name.charAt(5)); // get the character at index 5 of name
        System.out.println(name.endsWith("sh")); // check if name ends with the substring "sh"
        System.out.println(name.indexOf("tha")); // get the index of the first occurrence of substring "tha" in name
        System.out.println(name.indexOf("than")); // get the index of the first occurrence of substring "than" in name

        String s1 = "Sample String";
        String s = "  sample  2  ";

        System.out.println(s1.substring(2, 7)); // get the substring of s1 starting at index 2 and ending at index 7

        System.out.println(s1.replace(" S", "_s")); // replace all occurrences of " S" with "_s" in s1

        String[] s2 = s.split(" "); // split s into an array of strings around matches of the regular expression " "

        System.out.println(s.trim()); // remove leading and trailing whitespace from s

        System.out.println(s.equals(s1)); // check if s is equal to s1

        System.out.println(s.compareTo(s1)); // compare s and s1 lexicographically
        System.out.println("c".compareTo("b")); // compare "c" and "b" lexicographically

        for (String i : s2) {
            System.out.println("\'" + i + "\'"); // print each element of s2 surrounded by single quotes
        }

        // Additional string methods examples
        System.out.println(name.startsWith("Pra")); // check if name starts with the substring "Pra"
        System.out.println(name.isEmpty()); // check if name is an empty string
        System.out.println(String.join("-", s1, s)); // join s1 and s with a delimiter "-"

        // typecasting
        // Convert an int to a string
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println(numStr);

        // Convert a long to a string
        long longNum = 123456789L;
        String longNumStr = String.valueOf(longNum);
        System.out.println(longNumStr);

        // Convert a float to a string
        float floatNum = 1.23f;
        String floatNumStr = String.valueOf(floatNum);
        System.out.println(floatNumStr);

        // Convert a double to a string
        double doubleNum = 1.23456789;
        String doubleNumStr = String.valueOf(doubleNum);
        System.out.println(doubleNumStr);

        // Convert a boolean to a string
        boolean boolVal = true;
        String boolValStr = String.valueOf(boolVal);
        System.out.println(boolValStr);

        // Convert a char to a string
        char charVal = 'A';
        String charValStr = String.valueOf(charVal);
        System.out.println(charValStr);

    }
}
