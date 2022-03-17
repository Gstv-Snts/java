package warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1 && str == "o") {
            return "o";
        } else if (!str.substring(0, 1).equals("o") && str.substring(1, 2).equals("z")) {
            return "z";
        } else if (str.substring(0, 1).equals("o") && !str.substring(1, 2).equals("z")) {
            return "o";
        } else if (str.subSequence(0, 1).equals("o") && str.substring(1, 2).equals("z")) {
            return "oz";
        } else {
            return "";
        }
    }

}
