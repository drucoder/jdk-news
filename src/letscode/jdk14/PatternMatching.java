package letscode.jdk14;

public class PatternMatching {
    public static void demo() {
        System.out.println("%s %s".formatted(jdk13("some"), jdk14("some")));
    }

    private static String jdk13(Object data) {
        if (data instanceof String) {
            String knownType = (String) data;
            return knownType.toLowerCase();
        }

        return null;
    }

    private static String jdk14(Object data) {
        if (data instanceof String knownType) {
            return knownType.toLowerCase();
        }

        return null;
    }
}
