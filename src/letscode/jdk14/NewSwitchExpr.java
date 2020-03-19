package letscode.jdk14;

public class NewSwitchExpr {
    public static void demo() {
        System.out.println(jdk13(Month.SEP));
        System.out.println(jdk14(Month.JUL));
    }

    public static String jdk13(Month month) {
        var result = "";

        switch (month) {
            case JAN:
                result = "january";
                break;
            case FEB:
                result = "february";
                break;
            case MAR:
                result = "march";
                break;
            case APR:
                result = "april";
                break;
            case MAY:
                result = "may";
                break;
            case JUN:
                result = "juny";
                break;
            case JUL:
                result = "july";
                break;
            case AUG:
                result = "august";
                break;
            case SEP:
                result = "september";
                break;
            case OCT:
                result = "october";
                break;
            case NOV:
                result = "november";
                break;
            case DEC:
                result = "december";
                break;
            default: result = "NULL";
        }

        var time = "";

        switch (month) {
            case DEC:
            case JAN:
            case FEB:
                time = "winter"; break;
            case MAR:
            case APR:
            case MAY:
                time = "string"; break;
            case JUN:
            case JUL:
            case AUG:
                time = "summer".toUpperCase(); break;
            case SEP:
            case OCT:
            case NOV:
                time = "autumn";
        }

        return String.valueOf(result.charAt(0)).toUpperCase() +
                result.substring(1) + String.format(" (is %s)", time);
    }

    public static String jdk14(Month month) {
        var result = switch (month) {
//            case JAN -> "january";
            case FEB -> "february";
            case MAR -> "march";
            case APR -> "april";
            case MAY -> "may";
            case JUN -> "juny";
            case JUL -> "july";
            case AUG -> "august";
            case SEP -> "september";
            case OCT -> "october";
            case NOV -> "november";
            case DEC -> "december";
            default -> "january";
        };

        var time = "";
        switch (month) {
            case DEC, JAN, FEB -> {time = "winter";}
            case MAR, APR, MAY -> {time = "string";}
            case JUN, JUL, AUG -> {time = "summer".toUpperCase();}
            case SEP, OCT, NOV -> {time = "autumn";}
        }

        return String.valueOf(result.charAt(0)).toUpperCase() +
                result.substring(1) + String.format(" (is %s)", time);
    }
}

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}
