package letscode.jdk14;

public class MultilineBlocks {
    public static void demo() {
        System.out.println(jdk13());
        System.out.println(jdk14());
    }

    private static String jdk13() {
        return "select f.id, f.name, f.text \n" +
                "from files f \n" +
                "where f.creation_date > :week_before";
    }

    private static String jdk14() {
        return """
               
               select f.id, f.name, t.text \
               from files f\s\
               where f.creation_date > :week_before 
               """;
    }
}
