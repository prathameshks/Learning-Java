public class string_operations {
    public static void main(String[] args) {
        String name = "Prathamesh";
        String org = "MESCOE";

        // Concatenation
        System.out.println(name + " from " + org);

        // Length of String
        System.out.println("Name Length = " + name.length());

        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Escape Sequence
        System.out.println("\"" + name + "\"");
        System.out.println("Start" + "\\" + "End");
        System.out.println("Start" + "\t" + "End"); // tab
        System.out.println("Start" + "\n" + "End"); // new line
        System.out.println("Start" + "\'" + "End");

        // string methods
        System.out.println(name.contains("at"));
        System.out.println(name.contains("aT"));

        System.out.println(name.charAt(5));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.indexOf("tha"));
        System.out.println(name.indexOf("than"));

        String s1 = "Sample String";
        String s = "  sample  2  ";

        System.out.println(s1.substring(2, 7));

        System.out.println(s1.replace(" S", "_s"));

        String[] s2 = s.split(" ");

        System.out.println(s.trim());

        System.out.println(s.equals(s1));

        System.out.println(s.compareTo(s1)); // return s-s1 in unicode/ascii
        System.out.println("c".compareTo("b"));

        for (String i : s2) {
            System.out.println("\'" + i + "\'");
        }
    }
}
