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
    }
}
