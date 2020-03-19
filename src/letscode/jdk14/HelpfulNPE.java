package letscode.jdk14;

// -XX:+ShowCodeDetailsInExceptionMessages
public class HelpfulNPE {
    public static void demo() {
        var some = new Main();

        try {
            some.getChild().getEnd().getData();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }
}

class Main {
    private Child child = new Child();

    public Child getChild() {
        return child;
    }
}

class Child {
    private End end;

    public End getEnd() {
        return end;
    }
}

class End {
    private String data;

    public String getData() {
        return data;
    }
}
